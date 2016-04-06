package Services.Books;

import com.google.gson.Gson;
import com.heroku.sdk.jdbc.DatabaseUrl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import static spark.Spark.*;

import java.util.List;
import java.util.Map;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class BooksControler {
    private static List<HashMap<String, String>> arrayList ;
    Gson gson = new Gson();

    public BooksControler(final BooksService booksService) {
       
        
        get("/Books", (req, res) -> {
           
            return booksService.getAllBooks(); 
        }, gson::toJson);

       get("/Books/:id", (req, res) -> {
            Integer id = Integer.parseInt(req.params(":id"));
			 
            arrayList=booksService.getOneBook(id);
            if (!arrayList.isEmpty()) {
		return arrayList;
            }
			
            return "[{\"" + id + "\":\"Could not find the book you search for please try again. \"}]";
	}, gson::toJson);
        
        post("/Book", (req, res) -> {
            try 
        {
            String bookname = req.queryParams("name");
            String bookauthors = req.queryParams("authors");
            String bookcondition = req.queryParams("condition");
            String bookdescription = req.queryParams("description");
            String bookuniversity = req.queryParams("university");
            String bookschool = req.queryParams("school");
            String bookcourse = req.queryParams("course");
            String bookISBN13 = req.queryParams("ISBN13");
            String bookISBN10 = req.queryParams("ISBN10");
            String bookimg = req.queryParams("img");
            
            booksService.createBook(bookname, bookauthors, bookcondition, bookuniversity, bookschool,
                    bookcourse, bookISBN13, bookISBN10, bookimg, bookdescription);
            res.redirect("/index.html");
            return "";
        } catch (Exception e) {
            return e;
             }
	}, gson::toJson);
        
        
        get("/Universitys", (req, res) -> {
            try 
        {
            res.type("text/xml");
            return booksService.getAllUniversities();
            } catch (Exception e) {
            return e;
             }
        });
        get("/Universitys/:id", (req, res) -> {
         
            String id = req.params(":id");
            String result =booksService.getOneUniversities(id);

                if (result != null){
                    res.type("text/xml");
                    return  result;
                }
		else {
			return "error occured!!" + id;
		} 
 
	
	});
        
        get("/test", (request, response) -> {
            HashMap<String, Object> Book1 = new HashMap<String, Object>();
            Book1.put("name", "Engineering Psychology and Human Performance");
            Book1.put("uni", "University of Pittsburgh");
            Book1.put("course", "Human Factors in System Design");
            Book1.put("img", "book1.jpg");
            Book1.put("name2", "Some Book");
            Book1.put("uni2", "CMU");
            Book1.put("course2", "Course Name");
            Book1.put("img2", "Book.JPG");
            
            return new ModelAndView(Book1, "test.ftl");
        }, new FreeMarkerEngine());
        get("/registration", (request, response) -> {
             String about[]={"<h2>Tabadul</h2>","<h3 class='saudihouse'>The Saudi House in Pittsburgh</h3>","<h3 class='saudiemail'>saudi.n.pitt@gmail.com</h3></div><div class='col-6 col-m-6 '>",
             "<h3>What is Tabadul?</h3>","<p>Tabadul (The Arabic word for exchange as this website will provide books exchange services)is a service provided by the Saudi House in Pittsburgh. This service help Saudi students exchange books among each other.</p>",
             "<h3>Who we are?</h3>","<p>The Saudi House in Pittsburgh, which is a non-profit organization that act as a supervisory organization to the Saudi Clubs in all the different universities in Pittsburgh, have been serving saudi students and families living in the greater pittsburgh area for years. </p>"};
             Map<String, Object> aboutpart = new HashMap<>();
             aboutpart.put("aboutpart", about);
            return new ModelAndView(aboutpart, "registration.ftl");
        }, new FreeMarkerEngine());
        
        get("/db", (req, res) -> {
      Connection connection = null;
      Map<String, Object> attributes = new HashMap<>();
      try {
        connection = DatabaseUrl.extract().getConnection();

        Statement stmt = connection.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Accounts (ID int NOT NULL AUTO_INCREMENT, LastName varchar(255) NOT NULL, FirstName varchar(255), Address varchar(255), City varchar(255), PRIMARY KEY (ID))");
        stmt.executeUpdate("INSERT INTO Accounts (LastName,FirstName, Address, City) VALUES ('Alsaleh','Mansour', '705 Duncan Ave', 'Pittsburgh')");
        ResultSet rs = stmt.executeQuery("SELECT * FROM Accounts");

        ArrayList<String> output = new ArrayList<String>();
        while (rs.next()) {
          output.add( "Read from DB: " + rs.getRow());
        }

        attributes.put("results", output);
        return attributes;
      } catch (Exception e) {
        attributes.put("message", "There was an error: " + e);
        return attributes;
      } finally {
        if (connection != null) try{connection.close();} catch(SQLException e){}
      }
    },  gson::toJson);
    
    }

}