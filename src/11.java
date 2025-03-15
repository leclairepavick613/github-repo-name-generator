import java.util.Random;

public class GitHubRepoNameGenerator {
  public static void main(String[] args) {
    Random r = new Random();
    int num = r.nextInt(1000000);
    String repoName = "github-repo-name-" + num;
    System.out.println(repoName);
  }
}
