package Services.Books;

import java.util.*;

public class BooksService {
    private static HashMap<String, String> book ;
    private static ArrayList<Map<String, String>> arrayList ;
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
        BooksIDs.add(1);
        BooksIDs.add(2);
        
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
        int length = BooksIDs.size();
        
        for (int i = 0; i < length; i++) {
             
            book = new HashMap<String, String>();
            
                book.put("BookID",BooksIDs.get(i).toString());
                book.put("BookName",BooksNames.get(i));
                book.put("BookUniversity",BooksUniversity.get(i));
                book.put("BookImages",BooksImages.get(i));
                book.put("BookCourse",BooksCourse.get(i)); 
            arrayList.add(book);
        }
        
        
        return arrayList;
    }
    
    public ArrayList<Map<String, String>> getOneBook(Integer id){
        arrayList = new ArrayList<>();
        if(!id.equals("")){

            int length = BooksIDs.size();
            for (int i = 0; i<length; i++){
                if(id==BooksIDs.get(i)){
                    book = new HashMap<String, String>();
                    book.put("BookID",BooksIDs.get(i).toString());
                    book.put("BookName",BooksNames.get(i));
                    book.put("BookAuthors",BooksAuthors.get(i));
                    book.put("BookCondition",BooksCondition.get(i));
                    book.put("BookUniversity",BooksUniversity.get(i));
                    book.put("BookSchool",BooksSchool.get(i));  
                    book.put("BookDescription",BooksDescription.get(i));
                    book.put("BookISBN13",BooksISBN13.get(i));
                    book.put("BookISBN10",BooksISBN10.get(i));
                    book.put("BookImages",BooksImages.get(i));
                    book.put("BookCourse",BooksCourse.get(i)); 
                    arrayList.add(book);
                }
            }
        
        }
        return arrayList;
    }
    
    public String createBook(Integer id, String bookname, String bookauthors,
            String bookcondition, String bookuniversity, String bookschool, String bookcourse,
            String bookISBN13, String bookISBN10, String bookimg){
        if(id==3){
        BooksIDs.add(id);
        BooksNames.add(bookname);
        BooksAuthors.add(bookauthors);
        BooksCondition.add(bookcondition);
        BooksUniversity.add(bookuniversity);
        BooksSchool.add(bookschool);
        BooksDescription.add(bookcourse);
        BooksISBN13.add(bookISBN13);
        BooksISBN10.add(bookISBN10);
        BooksImages.add(bookimg);        
        return BooksNames.get(2);
        }
        else{
            return "";}
    }
    
    public Integer getNumberOfBooks(){
        int size = BooksIDs.size();
        return size;
    }
    public String getbooksname(){
        return BooksNames.get(0);
    }
}
