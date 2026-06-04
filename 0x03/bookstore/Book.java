import exceptions.InvalidAuthorException;
import exceptions.InvalidOperationException;

public class Book {
  private String title;
  private String author;
  private double price;

  public Book(String title, String author, double price) throws InvalidAuthorException, InvalidOperationException {
    setAuthor(author);
    setTitle(title);
    setPrice(price);
  }

  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public double getPrice() {
    return this.price;
  }

  public void setTitle(String title) throws InvalidOperationException {
    if (title == null || title.trim().length() < 3)
      throw new InvalidOperationException("Invalid book title");
    this.title = title;
  }

  public void setAuthor(String author) throws InvalidAuthorException {
    if (author == null)
      throw new InvalidAuthorException("Invalid author name");

    String[] name = author.trim().split("\\s+");
    if (name.length < 2)
      throw new InvalidAuthorException("Invalid author name");

    this.author = author;
  }

  public void setPrice(double price) throws InvalidOperationException {
    if (price <= 0)
      throw new InvalidOperationException("Invalid book price");
    this.price = price;
  }
}
