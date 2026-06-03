public class Manager extends Employee {
  public Manager(double fixedSalary) {
    super(fixedSalary);
  }

  @Override
  public double calculateBonus(Department department) {
    if (department.reachedTarget()) {
      return this.getFixedSalary() * 0.2;
    }
    return 0.00;
  }
}
