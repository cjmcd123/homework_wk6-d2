import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> rentedBook;

    public Borrower(String name){
        this.name = name;
        this.rentedBook = new ArrayList<Book>();
    }

    public String getName() {
        return this.name;
    }

    public int numberOfBooks() {
        return this.rentedBook.size();
    }

    public void rentBook(Library library){
        Book rental = library.rentBook();
        this.rentedBook.add(rental);
    }

    public void borrowFrom(Library library, Book book){
        Book book1 = library.findBook(book);
        if(book1 != null){
            this.rentedBook.add(book1);
        }
    }
}
