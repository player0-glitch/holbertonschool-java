public class Order {
  private double discountPercentage;
  private ItemOrder[] items;

  public Order(double discountPercentage, ItemOrder[] items) {
    this.discountPercentage = discountPercentage;
    this.items = items;
  }

  public double calculateTotal() {
    double total = 0.0;
    for (ItemOrder item : items) {
      total += item.getProduct().getNetPrice() * item.getQuantity();
    }
    total -= total * (discountPercentage / 100.0);
    return total;
  }

  public void presentOrderSummary() {
    System.out.println("------- ORDER SUMMARY -------");

    double totalProducts = 0.0;
    for (ItemOrder i : items) {
      String type = i.getProduct().getClass().getSimpleName();
      String title = i.getProduct().getTitle();
      double price = i.getProduct().getNetPrice();
      int quantity = i.getQuantity();
      double total = price * quantity;

      totalProducts += total;

      System.out.printf("Type: %-5s Title: %-25s Price: %.2f Quant: %d Total: %.2f%n", type, title, price, quantity,
          total);

      System.out.println("----------------------------");
      double discount = totalProducts * (discountPercentage / 100.0);
      System.out.printf("DISCOUNT: %,2f%n", discount);
      System.out.printf("TOTAL PRODUCTS: %,2f%n", totalProducts);
      System.out.println("----------------------------");
      System.out.printf("TOTAL ORDER: %,2f%n", calculateTotal());
      System.out.println("----------------------------");
    }
  }
}
