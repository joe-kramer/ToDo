public class Task {
  private String mDescription;
  private boolean mCompleted;

  public Task(String description) {
    mDescription = description;
    mCompleted = false;
  }

  public String getDescription() {
    return mDescription;
  }

  public boolean isCompleted() {
    return mCompleted;
  }
}
