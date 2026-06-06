import food.Food;
import mood.*;

public class Character {
  private int happinessPoints;

  public Character() {
    this.happinessPoints = 0;
  }

  public int getHappinessPoints() {
    return this.happinessPoints;
  }

  public void eat(Food[] foods) {
    for (Food f : foods) {
      if (f != null)
        this.happinessPoints += f.getHappinessPoints();
    }
  }

  public Mood getCurrentMood() {
    if (this.happinessPoints < -5) {
      return new Angry();
    } else if (this.happinessPoints <= 0 && this.happinessPoints >= -5) {
      return new Sad();
    } else if (this.happinessPoints <= 15 && this.happinessPoints > 0) {
      return new Happy();
    } else {
      return new VeryHappy();
    }
  }

  @Override
  public String toString() {
    Mood currentMood = getCurrentMood();
    return this.happinessPoints + " - " + currentMood.getClass().getSimpleName();
  }
}
