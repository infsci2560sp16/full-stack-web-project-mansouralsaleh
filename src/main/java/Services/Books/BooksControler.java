package Services.Books;

import com.google.gson.Gson;
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
    
    }

}