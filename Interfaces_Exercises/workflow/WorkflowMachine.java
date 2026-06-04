import activity.Activity;

public class WorkflowMachine {
  public void execute(Workflow wf) {
    for (Activity a : wf.getActivities()) {
      a.execute();
    }
  }
}
