import exceptions.InvalidOperationException;

public class FeeBasedBankAccount extends BasicBankAccount {
  private int transactionCount;

  public FeeBasedBankAccount(String accountNumber, int annualInterestRate) {
    super(accountNumber, (double) annualInterestRate);
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
    return this.transactionCount;
  }
}
