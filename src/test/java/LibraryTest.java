import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Codeclan", 5);
        book = new Book("Coding Bible", "reference");
    }

    @Test
    public void libraryHasName(){
        assertEquals("Codeclan", library.getName());
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void libraryCanAddBook(){
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void libraryCanNotAddBookIfFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.getNumberOfBooks());
    }

    @Test
    public void libraryCountsGenre(){
        Book book2 = new Book("Something Else", "biography");
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book2);
        int result = library.countGenre("reference");
        assertEquals(3, result);
    }

    @Test
    public void canCountGenres(){
        Book book2 = new Book("Something Else", "biography");
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book2);

        HashMap<String, Integer> expected = new HashMap<String, Integer>();
        expected.put("reference", 3);
        expected.put("biography", 1);

        assertEquals(expected, library.genreCount());
    }
}
