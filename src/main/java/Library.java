import java.util.ArrayList;

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
        if (getNumberOfBooks() < getCapacity())
        this.books.add(book);
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
}
