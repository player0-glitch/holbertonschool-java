public class Task {
  private String description;
  private boolean isDone;
  private int identifier;

  public Task(String description, int identifier) {
    this.isDone = false;
    this.identifier = identifier;

    modifyDescription(description);
  }

  public String getDescription() {
    return this.description;
  }

  public void setDone(boolean isDone) {
    this.isDone = isDone;
  }

  public boolean getIsDone() {
    return this.isDone;
  }

  public int getIdentifier() {
    return this.identifier;
  }

  /**
   * Adds a task to the list if its identifier is unique.
   * 
   * @throws IllegalArgumentException if the identifier already exists.
   */
  public void modifyDescription(String newDescription) {
    if (newDescription == null || newDescription.trim().isEmpty())
      throw new IllegalArgumentException("Invalid task description");
    this.description = newDescription;
  }
}
