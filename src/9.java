import java.util.Random;

public class GitHubRepoNameGenerator {
  public static void main(String[] args) {
    Random rand = new Random();
    String[] names = {"repo1", "repo2", "repo3"};
    int index = rand.nextInt(names.length);
    System.out.println("Random GitHub Repo Name: " + names[index]);
  }
}
