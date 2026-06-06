public class Employee {
  private String name;
  private int code;
  private Address address;

  public Employee(String name, int code, Address address) {
    this.name = name;
    this.code = code;
    this.address = address;
  }

  public void introduce() {
    System.out.printf("Code: %d%n", this.code);
    System.out.printf("Name: %s%n", this.name);
    System.out.printf("District: %s%n", this.address.getDistrict());
    System.out.printf("City: %s%n", this.address.getCity());
    System.out.printf("Country: %s", this.address.getCountry());
  }

  public String getName() {
    return name;
  }

  public int getCode() {
    return code;
  }

  public Address getAddress() {
    return address;
  }
}
