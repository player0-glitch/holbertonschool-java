import providers.Shipping;

public class Order {
  private int order;
  private double weight;
  private double total;
  private Shipping shipping;

  public Order(int order, double weight, double total) {
    this.order = order;
    this.weight = weight;
    this.total = total;
  }

  public void setShipping(Shipping shipping) {
    this.shipping = shipping;
  }

  public int getOrder() {
    return this.order;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getTotal() {
    return this.total;
  }

  public Shipping getShipping() {
    return this.shipping;
  }
}
