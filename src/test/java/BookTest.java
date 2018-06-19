import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Coding Bible", "reference");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Coding Bible", book.getTitle());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("reference", book.getGenre());
    }

}
