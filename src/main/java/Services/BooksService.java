package Services;

import java.util.*;

public class BooksService {
    private static HashMap<Integer , String[]> books  = new HashMap<>();
    private String[] BooksIDs = {"00001", "00002"};
    private String[] BooksNames = {"Engineering Psychology and Human Performance", "Some Book"};
    private String[] BooksAuthors = {"Christopher D. Wickens , Justin G. Hollands, Simon Banbury, Raja Parasuraman", "Many Authors"};
    private String[] BooksCondition = {"New", "Used - Very Good"};
    private String[] BooksUniversity = {"University of Pittsburgh", "CMU"};
    private String[] BooksSchool = {"School of Information Science", "CS"};
    private String[] BooksDescription = {"Forming connections between human performance and design Engineering Psychology and Human"
            + " Performance, 4e examines human-machine interaction. The book is organized directly from the psychological "
            + "perspective of human information processing. The chapters generally correspond to the flow of information as it is "
            + "processed by a human being--from the senses, through the brain, to action--rather than from the perspective of "
            + "system components or engineering design concepts. This book is ideal for a psychology student, engineering student, "
            + "or actual practitioner in engineering psychology, human performance, and human factors Learning Goals Upon "
            + "completing this book, readers should be able to: * Identify how human ability contributes to the design of "
            + "technology. * Understand the connections within human information processing and human performance. * Challenge the"
            + " way they think about technology's influence on human performance. * show how theoretical advances have been, or "
            + "might be, applied to improving human-machine interaction", "Test Description"};
    private String[] BooksISBN13 = {"978-0205021987", "111-2233445566"};
    private String[] BooksISBN10 = {"0205021980", "1122334455"};
    private String[] BooksImages = {"book1.jpg", "Book.JPG"};
    
    public HashMap<String, String[]> getAllBooks(){
        int length = BooksIDs.length;
        length = length+5;
        int id = 0001;
        for (int i = 0; i < length; i++) {
            if(i<2){
                books.put(id,new String[] {BooksIDs[0], BooksNames[0], BooksAuthors[0], BooksCondition[0], BooksUniversity[0], 
                    BooksSchool[0], BooksDescription[0], BooksISBN13[0], BooksISBN10[0], BooksImages[0]});
            }else{
                books.put(id,new String[] {BooksIDs[1], BooksNames[1], BooksAuthors[1], BooksCondition[1], BooksUniversity[1], 
                   BooksSchool[1], BooksDescription[1], BooksISBN13[1], BooksISBN10[1], BooksImages[1]}); 
            }
            id++;
        }
    return books;
    }
}
