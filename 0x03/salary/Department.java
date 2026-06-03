public class Department {

  private double targetValue;
  private double achievedTargetValue;

  public Department(double targetValue, double achievedTargetValue) {
    this.targetValue = targetValue;
    this.achievedTargetValue = achievedTargetValue;
  }

  public double getAchievedTargetValue() {
    return this.achievedTargetValue;
  }

  public double getTargetValue() {
    return this.targetValue;
  }

  public boolean reachedTarget() {
    return achievedTargetValue >= targetValue;
  }
}
