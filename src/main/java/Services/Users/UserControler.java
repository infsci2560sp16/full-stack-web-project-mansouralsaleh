package Services.Users;

import com.google.gson.Gson;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Date;

import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.post;

import com.heroku.sdk.jdbc.DatabaseUrl;
import spark.Request;

public class UserControler {
<<<<<<< HEAD
  
}

	





	
	
=======
    private static ArrayList<Map<String, String>> arrayList ;
    Gson gson = new Gson();

    public UserControler(final UserService userService) {
       
        
       
    
    }

}
>>>>>>> parent of e511b2b... last push with restful services
