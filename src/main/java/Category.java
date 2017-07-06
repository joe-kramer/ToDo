import java.util.List;
import java.util.ArrayList;

public class Category {
  private String mName;
  private static List<Category> instances = new ArrayList<Category>();
  private int mId;
  private List<Task> mTasks;

  public Category(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mTasks = new ArrayList<Task>();
  }

  public String getName() {
    return mName;
  }

  public static List<Category> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Category find(int id) {
    return instances.get(id - 1);
  }

  public List<Task> getTasks() {
    return mTasks;
  }

  public void addTask(Task task) {
    mTasks.add(task);
  }
}
