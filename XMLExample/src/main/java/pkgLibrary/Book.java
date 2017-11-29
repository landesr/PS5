package pkgLibrary;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import pkgException.BookException;

public class Book {
	private double cost;
	private String id;
	private String author;
	private String title;
	private String genre;
	private double price;
	private Date publish_date;
	private String description;

	public Book() {

	}

	public Book(String id, String author, String title, String genre, double price, double cost, Date publish_date, String description)
	{
		super();
		this.cost=cost;
		this.id = id;
		this.author = author;
		this.title = title;
		this.genre = genre;		
		this.price = price;
		this.publish_date = publish_date;
		this.description = description;
	}
	
	public Book(String s) throws BookException
	{
		Catalog c = new Catalog();
		Book b = c.getBook(s);
		this.id = b.id;
		this.author = b.author;
		this.title = b.title;
		this.genre = b.genre;		
		this.price = b.price;
		this.cost = b.cost;
		this.publish_date = b.publish_date;
		this.description = b.description;
		
	}

	public String getId() {
		return id;
	}

	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	@XmlElement
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	@XmlElement
	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
	

	@XmlElement
	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublish_date() {
		return publish_date;
	}

	@XmlElement
	public void setPublish_date(Date publish_date) {
		this.publish_date = publish_date;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	

}
