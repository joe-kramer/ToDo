import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
  private String mDescription;
  private boolean mCompleted;
  private LocalDateTime mCreatedAt;
  private static List<Task> instances = new ArrayList<Task>();

  public Task(String description) {
    mDescription = description;
    mCompleted = false;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public static List<Task> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
