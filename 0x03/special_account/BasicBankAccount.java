import exceptions.InvalidOperationException;

public class BasicBankAccount {
  private String accountNumber;
  private double balance;
  private double annualInterestRate;

  public BasicBankAccount(String accountNumber, double annualInterestRate)
      throws InvalidOperationException {
    this.accountNumber = accountNumber;
    this.balance = 0.0;
    this.annualInterestRate = annualInterestRate;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  public double getBalance() {
    return this.balance;
  }

  public void deposit(double value) throws InvalidOperationException {
    if (value <= 0) {
      throw new InvalidOperationException("Deposit amount must be greater than 0");
    }
    this.balance += value;
  }

  public double calculateMonthlyFee() {
    double tenPercent = this.balance * 0.1;
    return Math.min(10.0, tenPercent);
  }

  public void withdraw(double value) throws InvalidOperationException {
    if (value <= 0) {
      throw new InvalidOperationException("Withdrawal amount must be greater than 0");
    }
    if (value > this.balance) {
      throw new InvalidOperationException("Withdrawal amount must be less than current balance ");
    }
    this.balance -= value;
  }

  public double calculateMonthlyInterest() {
    if (this.balance <= 0)
      return 0.0;
    double monthlyInterestRate = (this.annualInterestRate / 12) * 100;
    return this.balance * monthlyInterestRate;
  }

  public void applyMonthlyUpdate() {
    double fee = calculateMonthlyFee();
    double interest = calculateMonthlyInterest();
    balance = balance - fee + interest;
  }
}
