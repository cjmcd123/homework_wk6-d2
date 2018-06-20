import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfBooks(){
        return this.books.size();
    }

    public void addBook(Book book) {
        if (getNumberOfBooks() < getCapacity()) {
            this.books.add(book);
        }
    }

    public Book rentBook() {
        return this.books.remove(0);
    }

    public int countGenre(String value) {
        int total = 0;
        for (Book book : this.books){
            if (value == book.getGenre()){
                total += 1;
            }
        }
        return total;
    }

    public Book findBook(Book book){
        int index = this.books.lastIndexOf(book);
        Book foundBook = this.books.remove(index);
        return foundBook;
    }

    public HashMap<String,Integer> genreCount() {
        HashMap<String, Integer> genres = new HashMap<String, Integer>();

        for (Book book : this.books){
            String genre = book.getGenre();

            if(genres.containsKey(genre)){
                int oldCount = genres.get(genre);
                int newCount = oldCount + 1;
                genres.put(genre, newCount);
            }
            else {
                genres.put(genre, 1);
            }
        }
        return genres;
    }
}
