package Services.Books;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.Route;

import com.heroku.sdk.jdbc.DatabaseUrl;
import spark.Request;

public class BooksControler {
    private static ArrayList<Map<String, String>> arrayList ;
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
            Integer bookID = booksService.getNumberOfBooks()+1;
            String bookname = req.queryParams("name");
            String bookauthors = req.queryParams("authors");
            String bookcondition = req.queryParams("condition");
            String bookuniversity = req.queryParams("university");
            String bookschool = req.queryParams("school");
            String bookcourse = req.queryParams("course");
            String bookISBN13 = req.queryParams("ISBN13");
            String bookISBN10 = req.queryParams("ISBN10");
            String bookimg = req.queryParams("img");
            
            String cont = booksService.createBook(bookID, bookname, bookauthors, bookcondition, bookuniversity, bookschool,
                    bookcourse, bookISBN13, bookISBN10, bookimg);
            if(!cont.equals("")){
            return cont + "+++"+booksService.getbooksname(); }
            return "Error";
	});
    
    }

}