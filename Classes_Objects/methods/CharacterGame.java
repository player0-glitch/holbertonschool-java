public class CharacterGame {
  public int currentHealth;
  public String name;

  public CharacterGame(String name, int currentHealth) {
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
    currentHealth -= damageAmount;
    if (currentHealth < 0)
      currentHealth = 0;
  }

  public void receiveHealing(int healingAmount) {
    currentHealth += healingAmount;
    if (currentHealth > 100)
      currentHealth = 100;
  }

  public void setCurrentHealth(int currentHealth) {
    this.currentHealth = currentHealth;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void displayStatus() {
    System.out.println(name + " has " + currentHealth + " health points.");
  }

}
