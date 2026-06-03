public class Employee {
  private double fixedSalary;

  public Employee(double fixedSalary) {
    this.fixedSalary = fixedSalary;
  }

  public double getFixedSalary() {
    return fixedSalary;
  }

  public double calculateTotalSalary(Department department) {
    return fixedSalary + calculateBonus(department);
  }

  public double calculateBonus(Department department) {
    if (department.reachedTarget()) {
      return this.fixedSalary * 0.1;
    }
    return 0.00;
  }
}
