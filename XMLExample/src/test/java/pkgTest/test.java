package pkgTest;
import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import pkgLibrary.Catalog;
import pkgLibrary.Book;
import pkgException.BookException;

public class test {
	@Test
	public void testAddBook() throws BookException {
		Catalog c = new Catalog();
		Book b = new Book("a", "b", "c", "d", 1.1,2.2, new Date(), "e");
		c.addBook(0, b);
		
		Book d = new Book("bk101");
		try {
			c.addBook(0, b);
		}catch(BookException e) {
			
		}
	}
	@Test
	public void testGetBook() throws BookException {
		Catalog c = new Catalog();
		Book b = c.getBook("bk101");
		
		try {
			Book b2 = c.getBook("bk");
		} catch (BookException n) {
		}
	}
}
