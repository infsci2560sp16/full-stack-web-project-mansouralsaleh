package Services;

import com.google.gson.Gson;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Date;

import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;
import spark.Request;

public class BooksControler {

    Gson gson = new Gson();

    public BooksControler(final BooksService booksService) {
       
        get("/Books", (req, res) -> {
            return booksService.getAllBooks();
        }, gson::toJson);
    
    }

    private void setupRoutes() {

  }
}