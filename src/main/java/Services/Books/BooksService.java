package Services.Books;

import Services.Books.BooksarrayJSON.Books;
import com.google.gson.Gson;
import com.google.gson.*;
import com.google.common.collect.Lists;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.reflect.Type;
import java.util.Map.Entry;

public class BooksService {
    private static HashMap<String, String> book ;
    private static List<HashMap<String,String>> arrayList ;
     private static ArrayList<Books> BooksList ;
    private LinkedList<Integer> BooksIDs  = new LinkedList<>();// {"00001", "00002"};
   // private String[] BooksNames = {"Engineering Psychology and Human Performance", "Some Book"};
    private LinkedList<String> BooksNames  = new LinkedList<>();
    //private String[] BooksAuthors = {"Christopher D. Wickens , Justin G. Hollands, Simon Banbury, Raja Parasuraman", "Many Authors"};
    private LinkedList<String> BooksAuthors  = new LinkedList<>();
   // private String[] BooksCondition = {"New", "Used - Very Good"};
    private LinkedList<String> BooksCondition  = new LinkedList<>();
   // private String[] BooksUniversity = {"University of Pittsburgh", "CMU"};
    private LinkedList<String> BooksUniversity  = new LinkedList<>();
   // private String[] BooksSchool = {"School of Information Science", "CS"};
    private LinkedList<String> BooksSchool  = new LinkedList<>();
   // private String[] BooksDescription = {"Forming connections between human performance and design Engineering Psychology and Human"
    //        + " Performance, 4e examines human-machine interaction. The book is organized directly from the psychological "
    //        + "perspective of human information processing. The chapters generally correspond to the flow of information as it is "
    //        + "processed by a human being--from the senses, through the brain, to action--rather than from the perspective of "
    //        + "system components or engineering design concepts. This book is ideal for a psychology student, engineering student, "
     //       + "or actual practitioner in engineering psychology, human performance, and human factors Learning Goals Upon "
    //        + "completing this book, readers should be able to: * Identify how human ability contributes to the design of "
    //        + "technology. * Understand the connections within human information processing and human performance. * Challenge the"
    //        + " way they think about technology's influence on human performance. * show how theoretical advances have been, or "
    //        + "might be, applied to improving human-machine interaction", "Test Description"};
    private LinkedList<String> BooksDescription  = new LinkedList<>();
    //private String[] BooksISBN13 = {"978-0205021987", "111-2233445566"};
    private LinkedList<String> BooksISBN13  = new LinkedList<>();
    //private String[] BooksISBN10 = {"0205021980", "1122334455"};
    private LinkedList<String> BooksISBN10  = new LinkedList<>();
    //private String[] BooksImages = {"book1.jpg", "Book.JPG"};
    private LinkedList<String> BooksImages  = new LinkedList<>();
    //private String[] BooksCourse = {"Human Factors in System Design", "Course Name"};
    private LinkedList<String> BooksCourse  = new LinkedList<>();
    
    public BooksService(){
        
       // saveListToFile();
    }
    public List<HashMap<String,String>> getAllBooks(){
        return readCurrentList();
    }
    
    public List<HashMap<String,String>> getOneBook(Integer id){
        List<HashMap<String,String>> Books = readCurrentList();
        Integer size = Books.size();
        arrayList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i<size; i++){
            if(Books.get(i).get("BookID").equals(id.toString())){
                    book = new HashMap<String, String>();
                    book.put("BookID",Books.get(i).get("BookID"));
                    book.put("BookName",Books.get(i).get("BookName"));
                    book.put("BookAuthors",Books.get(i).get("BookAuthors"));
                    book.put("BookCondition",Books.get(i).get("BookCondition"));
                    book.put("BookUniversity",Books.get(i).get("BookUniversity"));
                    book.put("BookSchool",Books.get(i).get("BookSchool"));  
                    book.put("BookDescription",Books.get(i).get("BookDescription"));
                    book.put("BookISBN13",Books.get(i).get("BookISBN13"));
                    book.put("BookISBN10",Books.get(i).get("BookISBN10"));
                    book.put("BookImages",Books.get(i).get("BookImages"));
                    book.put("BookCourse",Books.get(i).get("BookCourse")); 
                    arrayList.add(book);   
            }
        }
        return arrayList;
    }
    
    public void createBook(Integer id, String bookname, String bookauthors,
            String bookcondition, String bookuniversity, String bookschool, String bookcourse,
            String bookISBN13, String bookISBN10, String bookimg, String bookdescription){
        
        try {
            List<HashMap<String,String>> Books = readCurrentList();
            book = new HashMap<String, String>();
            Integer size=Books.size();
            size = size+1;
            book.put("BookID", size.toString());
            book.put("BookName", bookname);
            book.put("BookAuthors", bookauthors);
            book.put("BookCondition", bookcondition);
            book.put("BookUniversity", bookuniversity);
            book.put("BookSchool", bookschool);  
            book.put("BookDescription",bookdescription);
            book.put("BookISBN13", bookISBN13);
            book.put("BookISBN10",bookISBN10);
            book.put("BookImages",bookimg);
            book.put("BookCourse", bookcourse); 
            Books.add(book); 
            Gson gson = new GsonBuilder().create();

            String arrayListToJson = gson.toJson(Books);

            String filename = "Book_entries.json";
            File file = new File("src\\main\\resources\\public", filename);        	
            file.delete();
            
                BufferedWriter buffWriter = new BufferedWriter(new FileWriter(file, true));
                buffWriter.append(arrayListToJson);
                buffWriter.newLine();
                buffWriter.close();
        } catch (IOException e) {
                
            }  
        }
    
    public Integer getNumberOfBooks(){
        int size = BooksIDs.size();
        return size;
    }
    public String getbooksname(){
        return BooksNames.get(0);
    }
    
    //next two methods adopted from http://stackoverflow.com/questions/24573598/write-arraylist-of-custom-objects-to-file
    public int saveListToFile() {
        Books book1 = new Books();
        book1.setBookID(1);
        book1.setBookName("Engineering Psychology and Human Performance");
        book1.setBookAuthor("Christopher D. Wickens , Justin G. Hollands, Simon Banbury, Raja Parasuraman");
        book1.setBookCondition("New");
        book1.setBookUniversity("University of Pittsburgh");
        book1.setBookSchool("School of Information Science");
        book1.setBookDescription("Forming connections between human performance and design Engineering Psychology and Human"
            + " Performance, 4e examines human-machine interaction. The book is organized directly from the psychological "
            + "perspective of human information processing. The chapters generally correspond to the flow of information as it is "
            + "processed by a human being--from the senses, through the brain, to action--rather than from the perspective of "
            + "system components or engineering design concepts. This book is ideal for a psychology student, engineering student, "
            + "or actual practitioner in engineering psychology, human performance, and human factors Learning Goals Upon "
            + "completing this book, readers should be able to: * Identify how human ability contributes to the design of "
            + "technology. * Understand the connections within human information processing and human performance. * Challenge the"
            + " way they think about technology's influence on human performance. * show how theoretical advances have been, or "
            + "might be, applied to improving human-machine interaction");
        book1.setBookISBN13("978-0205021987");
        book1.setBookISBN10("0205021980");
        book1.setBookImages("book1.jpg");
        book1.setBookCourse("Human Factors in System Design");
        
        Books book2 = new Books();
        book2.setBookID(2);
        book2.setBookName("Some Book");
        book2.setBookAuthor("Many Authors");
        book2.setBookCondition("Used - Very Good");
        book2.setBookUniversity("CMU");
        book2.setBookSchool("CS");
        book2.setBookDescription("Test Description");
        book2.setBookISBN13("111-2233445566");
        book2.setBookISBN10("1122334455");
        book2.setBookImages("Book.JPG");
        book2.setBookCourse("Course Name");

        List<Books> Books = Lists.newArrayList(book1, book2);
        Gson gson = new GsonBuilder().create();

        String arrayListToJson = gson.toJson(Books);

        String filename = "Book_entries.json";
        File file = new File("https://nameless-mountain-5787.herokuapp.com/Book_entries.json");        	
        file.delete();
        try {
            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(file, true));
            buffWriter.append(arrayListToJson);
            buffWriter.newLine();
            buffWriter.close();
        } catch (IOException e) {
            return -1;
        }
        return 0;
    }

    public List<HashMap<String,String>> readCurrentList() {
        String filename = "Book_entries.json";
        File file = new File("https://nameless-mountain-5787.herokuapp.com/Book_entries.json");   
        List<HashMap<String,String>> Book = null;
        try {
            Gson gson = new Gson();

            BufferedReader buffReader = new BufferedReader(new FileReader(file));
            String line;
            String jsonString= "";
            while ((line = buffReader.readLine()) != null) {
                jsonString= jsonString+line;
            }
            buffReader.close();
            @SuppressWarnings("serial")
		Type collectionType = new TypeToken<List<HashMap<String,String>>>() {
		}.getType();
		Book = gson.fromJson(jsonString, collectionType);
                return Book;
        } catch (IOException e) {
            return Book;
        }
        
    }
    
}
