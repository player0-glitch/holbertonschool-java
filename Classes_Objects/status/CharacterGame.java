public class CharacterGame {
  public int currentHealth;
  public String name;
  private String status;

  public CharacterGame(String name, int currentHealth, String status) {
    this.name = name;
    this.currentHealth = currentHealth;
  }

  public CharacterGame() {
  }

  public int getCurrentHealth() {
    return this.currentHealth;
  }

  public String getName() {
    return this.name;
  }

  public void takeDamage(int damageAmount) {
    setCurrentHealth(this.currentHealth - damageAmount);
  }

  public void receiveHealing(int healingAmount) {
    setCurrentHealth(currentHealth + healingAmount);
    if (currentHealth > 100) {
      currentHealth = 100;
      this.status = "alive";
    }
  }

  public void setCurrentHealth(int currentHealth) {
    this.currentHealth = currentHealth;
    if (currentHealth > 0) {
      this.status = "alive";
    } else {
      this.status = "dead";
      this.currentHealth = 0;
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getStatus() {
    return this.status;
  }

  public void displayStatus() {
    System.out.println(name + " has " + currentHealth + " health points.");
  }

}
