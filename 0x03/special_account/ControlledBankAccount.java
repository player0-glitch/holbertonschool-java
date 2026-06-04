package exceptions.InvalidOperationException

public class ControlledBankAccount extends BasicBankAccount {
  public double minimumBalance;
  public double penaltyAmount;

  public ControlledBankAccount(String accountNumber, double annualInterestRate, double minimumBalance,
      double penaltyAmount) {
    super(accountNumber, annualInterestRate);
    this.minimumBalance = minimumBalance;
    this.penaltyAmount = penaltyAmount;
  }

  @Override
  public void applyMonthlyUpdate() {
    double fee = calculateMonthlyFee();
    double interest = calculateMonthlyInterest();
    double newBalance = getBalance() - fee + interest;

    if (newBalance < minimumBalance) {
      newBalance -= penaltyAmount;
    }
    setBalance(newBalance);
  }

  public double getPenaltyAmount() {
    return this.penaltyAmount;
  }

  public double getMinimumBalance() {
    return this.minimumBalance;
  }

}
