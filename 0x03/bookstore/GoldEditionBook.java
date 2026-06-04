import exceptions.InvalidAuthorException;
import exceptions.InvalidOperationException;
import products.Book;

public class GoldEditionBook extends Book {
  public GoldEditionBook(String title, String author, double price)
      throws InvalidAuthorException, InvalidOperationException {
    super(title, author, price);
  }

  @Override
  public double getPrice() {
    return super.getPrice() * 1.30;
  }
}
