public class Square extends Rectangle {

  private double side;

  public void setSide(double side) {
    if (side < 0)
      throw new IllegalArgumentException(
          "Side must be greater or equal to 0, otherwise assign value to the side, width and height");
    this.side = side;
  }

  public String toString() {
    return String.format("[Square] %d\n", this.side);
  }

  public double getSide() {
    return this.side;
  }
}
