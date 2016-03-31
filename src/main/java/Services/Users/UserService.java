package Services.Users;

import java.util.*;

public class UserService {
    private static HashMap<String, String> user ;
    private static ArrayList<Map<String, String>> userarrayList ;
    private LinkedList<Integer> UserID  = new LinkedList<>();
    private LinkedList<String> Status  = new LinkedList<>();
    private LinkedList<String> FirstName  = new LinkedList<>();
    private LinkedList<String> LastName  = new LinkedList<>();
    private LinkedList<String> EduEmail  = new LinkedList<>();
    private LinkedList<String> CellPhone  = new LinkedList<>();
    private LinkedList<String> Password  = new LinkedList<>();
    private LinkedList<String> School  = new LinkedList<>();
    private LinkedList<String> Major  = new LinkedList<>();
    private LinkedList<String> Bio  = new LinkedList<>();
    
    public UserService(){
        UserID.add(1);
        Status.add("Mr");
        FirstName.add("Mansour");
        LastName.add("Alsaleh");
        EduEmail.add("MMA74@pitt.edu");
        CellPhone.add("5554443333");
        Password.add("1234567890");
        School.add("University of Pittsburgh");
        Major.add("MSIS");
        Bio.add("Hi I am Mansour");
    }
    
   
}
