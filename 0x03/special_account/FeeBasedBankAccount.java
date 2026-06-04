import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
  private double transactionCount;

  public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
    super(accountNumber, annualInterestRate);
    this.transactionCount = 0;
  }

  @Override
  public void applyMonthlyUpdate() {
    double fee = calculateMonthlyFee();
    double interest = calculateMonthlyInterest();
    double newBalance = getBalance() - fee + interest;
    setBalance(newBalance);
  }

  @Override
  public void deposit(double value) throws InvalidOperationException {
    super.withdraw(transactionCount);
    transactionCount++;
    setBalance(getBalance() - 0.10);
  }

  @Override
  public void withdraw(double value) throws InvalidOperationException {
    super.withdraw(value);
    transactionCount++;
    setBalance(getBalance() - 0.10);
  }

  public int getTransactionCount() {
    return (int) this.transactionCount;
  }
}
