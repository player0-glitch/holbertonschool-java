class Food {
  private String name;
  private int calories;
  private double price;

  public Food(String name, int calories, double price) {
    this.name = name;
    this.calories = calories;
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("[%s] %d $ %f", name, calories, price);
  }
}
