package persons.tasks.generator;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import persons.tasks.taskDSL.Action;
import persons.tasks.taskDSL.Planning;
import persons.tasks.taskDSL.Task;

@SuppressWarnings("all")
public class Auxiliary {
  public static List<Action> getActions(final Planning root) {
    List<Action> actionlist = new ArrayList<Action>();
    EList<Task> _tasks = root.getTasks();
    for (final Task t : _tasks) {
      actionlist.add(t.getAction());
    }
    return actionlist;
  }
}
