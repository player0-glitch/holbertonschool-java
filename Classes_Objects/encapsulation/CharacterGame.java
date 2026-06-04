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
