import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before(){
        borrower = new Borrower("Bob");
        library = new Library("Codeclan", 5);
        book = new Book("Coding Bible", "reference");
        library.addBook(book);
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Bob", borrower.getName());
    }

    @Test
    public void rentedBooksStartsEmpty(){
        assertEquals(0, borrower.numberOfBooks());
    }

    @Test
    public void rentBook(){
        borrower.rentBook(library);
        assertEquals(0, library.getNumberOfBooks());
        assertEquals(1, borrower.numberOfBooks());
    }

    @Test
    public void rentSpecificBook(){
        borrower.borrowFrom(library, book);
        assertEquals(0, library.getNumberOfBooks());
        assertEquals(1, borrower.numberOfBooks());
    }

}
