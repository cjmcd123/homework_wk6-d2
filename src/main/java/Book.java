import javax.print.DocFlavor;
import java.util.HashMap;

public class Book {

    private String title;
    private String genre;

    public Book(String title, String genreInput){
        this.title = title;
        this.genre = genreInput;

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

//    private HashMap<String, String> book;
//
//    public Book(String title, String genreInput){
//        book = new HashMap();
//        book.put("title", title);
//        book.put("genre", genreInput);
//    }
//
//    public String getTitle(){
//        String output = this.book.get("title");
//        return output;
//    }
//
//    public String getGenre(){
//        String output = this.book.get("genre");
//        return output;
//    }
}
