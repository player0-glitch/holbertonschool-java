import java.util.Iterator;
import java.util.ArrayList;

public class Order {
  private final ArrayList<CookieOrder> cookies;

  public Order() {
    this.cookies = new ArrayList<>();
  }

  public void addCookieOrder(CookieOrder cookieOrder) {
    if (cookieOrder != null)
      this.cookies.add(cookieOrder);
  }

  public int getTotalBoxes() {
    int total = 0;
    for (CookieOrder o : cookies) {
      total += o.getBoxQuantity();
    }
    return total;
  }

  public int removeFlavor(String flavourToBeRemoved) {
    int totalBoxesRemoved = 0;
    if (flavourToBeRemoved == null)
      return totalBoxesRemoved;

    Iterator<CookieOrder> iterator = cookies.iterator();
    while (iterator.hasNext()) {
      CookieOrder currentOrder = iterator.next();

      if (currentOrder.getFlavor().equalsIgnoreCase(flavourToBeRemoved)) {
        totalBoxesRemoved += currentOrder.getBoxQuantity();
        iterator.remove();
      }
    }
    return totalBoxesRemoved;
  }
}
