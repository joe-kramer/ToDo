import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
  private String description;
  private boolean completed;
  private LocalDateTime createdAt;
  private int id;

  public Task(String description) {
    this.description = description;
    completed = false;
    createdAt = LocalDateTime.now();
  }

  public String getDescription() {
    return description;
  }

  public boolean isCompleted() {
    return completed;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public static List<Task> all() {
  }

  public int getId() {
    return id;
  }

  public static Task find(int id) {
  }
}
