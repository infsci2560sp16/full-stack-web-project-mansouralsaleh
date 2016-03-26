package Services;

import java.util.*;

public class BooksService {
    private static HashMap<String, String> book ;
    private static ArrayList<Map<String, String>> arrayList ;
    private LinkedList<String> BooksIDs  = new LinkedList<>();// {"00001", "00002"};
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
        BooksIDs.add("0001");
        BooksIDs.add("0002");
        
        BooksNames.add("Engineering Psychology and Human Performance");
        BooksNames.add("Some Book");
        
        BooksAuthors.add("Christopher D. Wickens , Justin G. Hollands, Simon Banbury, Raja Parasuraman");
        BooksAuthors.add("Many Authors");
        
        BooksCondition.add("New");
        BooksCondition.add("Used - Very Good");
        
        BooksUniversity.add("University of Pittsburgh");
        BooksUniversity.add("CMU");
        
        BooksSchool.add("School of Information Science");
        BooksSchool.add("CS");
        
        BooksDescription.add("Forming connections between human performance and design Engineering Psychology and Human"
            + " Performance, 4e examines human-machine interaction. The book is organized directly from the psychological "
            + "perspective of human information processing. The chapters generally correspond to the flow of information as it is "
            + "processed by a human being--from the senses, through the brain, to action--rather than from the perspective of "
            + "system components or engineering design concepts. This book is ideal for a psychology student, engineering student, "
            + "or actual practitioner in engineering psychology, human performance, and human factors Learning Goals Upon "
            + "completing this book, readers should be able to: * Identify how human ability contributes to the design of "
            + "technology. * Understand the connections within human information processing and human performance. * Challenge the"
            + " way they think about technology's influence on human performance. * show how theoretical advances have been, or "
            + "might be, applied to improving human-machine interaction");
        BooksDescription.add("Test Description");
        
        BooksISBN13.add("978-0205021987");
        BooksISBN13.add("111-2233445566");
        
        BooksISBN10.add("0205021980");
        BooksISBN10.add("1122334455");
        
        BooksImages.add("book1.jpg");
        BooksImages.add("Book.JPG");
        
        BooksCourse.add("Human Factors in System Design");
        BooksCourse.add("Course Name");
    }
    public ArrayList<Map<String, String>> getAllBooks(){
        
        arrayList = new ArrayList<>();
        int length = 2;
        length = length+5;
        for (int i = 0; i < length; i++) {
             
            book = new HashMap<String, String>();
            
            if(i <= 2){
                book.put("BookID",BooksIDs.get(0));
                book.put("BookName",BooksNames.get(0));
                book.put("BookUniversity",BooksUniversity.get(0));
                book.put("BookImages",BooksImages.get(0));
                book.put("BookCourse",BooksCourse.get(0)); 
            }else{
                book.put("BookID",BooksIDs.get(1));
                book.put("BookName",BooksNames.get(1));
                book.put("BookUniversity",BooksUniversity.get(1));
                book.put("BookImages",BooksImages.get(1));
                book.put("BookCourse",BooksCourse.get(1)); 
            }
            arrayList.add(book);
        }
        
        
        return arrayList;
    }
    
    public ArrayList<Map<String, String>> getOneBook(String id){
        arrayList = new ArrayList<>();
        int pointer;
        if(id !=""){
            switch(id){
                case "0001":
                    pointer=0;
                    break;
                case "0002":
                    pointer=1;
                    break;
            }
            book = new HashMap<String, String>();
            book.put("BookID",BooksIDs.get(0));
            book.put("BookName",BooksNames.get(0));
            book.put("BookAuthors",BooksAuthors.get(0));
            book.put("BookCondition",BooksCondition.get(0));
            book.put("BookUniversity",BooksUniversity.get(0));
            book.put("BookSchool",BooksSchool.get(0));  
            book.put("BookDescription",BooksDescription.get(0));
            book.put("BookISBN13",BooksISBN13.get(0));
            book.put("BookISBN10",BooksISBN10.get(0));
            book.put("BookImages",BooksImages.get(0));
            book.put("BookCourse",BooksCourse.get(0)); 
            arrayList.add(book);
        }
        
        return arrayList;
    }
}
