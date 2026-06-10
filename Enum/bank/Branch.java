import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name) {
    this.name = name;
    this.customers = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Customer> getCustomers() {
    return this.customers;
  }

  public Customer findCustomer(String customerName) {
    for (Customer c : this.customers) {
      if (c.getName().equalsIgnoreCase(customerName))
        return c;
    }
    return null;
  }

  public boolean addCustomerTransaction(String customerName, double amount) {
    Customer exists = findCustomer(customerName);
    if (exists != null) {
      exists.addTransaction(amount);
      return true;
    }
    return false;
  }

  public boolean addCustomer(String customerName, double amount) {
    Customer customer = findCustomer(customerName);
    if (customer == null) {
      this.customers.add(new Customer(customerName, amount));
      return true;
    }
    return false;
  }
}
