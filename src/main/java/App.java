import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("tasks", request.session().attribute("tasks"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/tasks", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Task> tasks = request.session().attribute("tasks");
      if(tasks == null) {
        tasks = new ArrayList<Task>();
        request.session().attribute("tasks", tasks);
      }

      String description = request.queryParams("description");
      Task newTask = new Task(description);
      tasks.add(newTask);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
