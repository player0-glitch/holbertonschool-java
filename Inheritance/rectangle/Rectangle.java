public class Rectangle extends GeometricShape {
  private double width;
  private double height;

  public void setWidth(double width) {
    if (width < 0)
      throw new IllegalArgumentException("width must be greater or equal to 0, otherwise assign value to the width");
    this.width = width;
  }

  public void setHeight(double height) {
    if (height < 0)
      throw new IllegalArgumentException("width must be greater or equal to 0, otherwise assign value to the width");
    this.height = height;
  }

  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }
}
