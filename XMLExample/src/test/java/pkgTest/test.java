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
		try {
			c.addBook(1, b);
		}catch(BookException e) {
			
		}
	}
	@Test
	public void testGetBook() throws BookException {
		Catalog c = new Catalog();
		Book m = c.getBook("bk102");
		try {
			Book m = c.getBook("bkMadeline");
		} catch (BookException n) {
		}
	}
}
