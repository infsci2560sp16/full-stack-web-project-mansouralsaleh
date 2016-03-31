package Services.Books;

import com.google.gson.Gson;
import java.util.HashMap;
import static spark.Spark.*;

import java.util.List;

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
    
    }

}