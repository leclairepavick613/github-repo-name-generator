public class MyProject {
  private String projectName;

  public MyProject(String projectName) {
    this.projectName = projectName;
  }

  public void addDescription(String description) {
    System.out.println("Generated description: " + description);
  }
}
