public class PositiveInteger {
  private int value;

  public PositiveInteger(int value) {
    validate(value);
    this.value = value;
  }

  public PositiveInteger(String value) {
    try {
      int intValue = Integer.parseInt(value);
      validate(intValue);
      this.value = intValue;
    } catch (NumberFormatException ex) {
      throw new IllegalArgumentException("Value is not a positive integer");
    }
  }

  public void setValue(int value) {
    validate(value);
    this.value = value;
  }

  private void validate(int val) {
    if (val <= 0) {
      throw new IllegalArgumentException("Value is not a positive integer");
    }
  }

  public int getValue() {
    return this.value;
  }

  public boolean isPrime() {
    if (value <= 1) {
      return false;
    }
    if (value % 2 == 0)
      return false;

    for (int i = 3; i * i <= value; i += 2) {
      if (value % i == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {
    return String.valueOf(this.value);
  }
}
