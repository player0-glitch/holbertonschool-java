import java.util.ArrayList;

public class Bank {
  private String name;
  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<>();
  }

  public Branch findBranches(String branchName) {
    for (Branch b : this.branches) {
      if (b.getName().equalsIgnoreCase(branchName))
        return b;
    }
    return null;
  }

  public boolean addBranch(String branchName) {
    if (findBranches(branchName) == null) {
      branches.add(new Branch(branchName));
      return true;
    }
    return false;
  }

  public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
    Branch branch = findBranches(branchName);
    if (branch != null) {
      return branch.newCustomer(customerName, initialTransaction);
    }
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction) {
    Branch branch = findBranches(branchName);
    if (branch != null) {
      return branch.addCustomerTransaction(customerName, initialTransaction);
    }
    return false;
  }

  public boolean listCustomers(String branchName, boolean printTransactions) {
    Branch branch = findBranches(branchName);
    if (branch == null)
      return false;

    ArrayList<Customer> customers = branch.getCustomers();

    for (int i = 0; i < customers.size(); i++) {
      Customer c = customers.get(i);
      System.out.println("Client: " + c.getName() + " [" + (i + 1) + "]");
      if (printTransactions) {
        // System.out.println("Transactions:");
        for (double t : c.getTransactions()) {
          System.out.printf("[%d] value %2f", (i + 1), t);
        }
      }
    }
    System.out.println();
    return true;
  }
}
