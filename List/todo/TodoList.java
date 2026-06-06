import java.util.ArrayList;
import java.util.List;

public class TodoList {
  private List<Task> tasks;

  public TodoList() {
    this.tasks = new ArrayList<>();
  }

  public void addTask(Task task) {
    if (task == null)
      return;

    for (Task t : tasks) {
      if (t.getIdentifier() == task.getIdentifier())
        throw new IllegalArgumentException("Task with identifier " + t.getIdentifier() + " already exists in the list");

      this.tasks.add(task);
    }
  }

  public boolean markTaskDone(int identifier) {
    for (Task t : tasks) {
      if (t.getIdentifier() == identifier) {
        t.setDone(true);
        return true;
      }
    }
    return false;
  }

  public boolean undoTask(int identifier) {
    for (Task t : tasks) {
      if (t.getIdentifier() == identifier) {
        t.setDone(false);
        return true;
      }
    }
    return false;
  }

  public void undoAll() {
    for (Task t : tasks) {
      t.setDone(false);
    }
  }

  public void completeAll() {
    for (Task t : tasks) {
      t.setDone(true);
    }
  }

  public void listTasks() {
    for (Task t : tasks) {
      String checkmark = t.getIsDone() ? "X" : " ";
      System.out.printf("[%s] Id: %d - Description: %s%n", checkmark, t.getIdentifier(), t.getDescription());
    }
  }
}
