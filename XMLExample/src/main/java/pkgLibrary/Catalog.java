package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

import pkgException.BookException;
import pkgMain.XMLReader;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;

	@XmlElement(name = "book")
	ArrayList<Book> books;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public Book getBook(String s) throws BookException {
		Book b = new Book();
		boolean k = false;
		XMLReader x = new XMLReader();
		Catalog c = x.readCatalog();
		ArrayList<Book> arr = c.getBooks();
		for(Book i:arr) {
			if (i.getId().equals(s)) {
				b = i;
				k = true;
				break;
			}
		}
	
		if (!k) {
			throw new BookException("Does not contain book");
		}
		return b;
	}

	public Catalog addBook(int CatalogID, Book addedBook) throws BookException {

		Book b = new Book();
		boolean k = false;
		XMLReader r = new XMLReader();
		Catalog c = r.readCatalog();
		ArrayList<Book> arr = c.getBooks();

		for (Book i:arr) {
			if (i.getId().equals(addedBook.getId())) {
				b = i;
				k = true;
			}
		}

		if (k) {
			throw new BookException("Already Contains Book");
		}

		else {
			arr.add(addedBook);
		}

		c.setBooks(arr);
		r.writeXML(c);
		return c;

	}

}
