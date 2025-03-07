import java.util.Random;

public class GitHubRepoNameGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(1000);
        String repoName = "github-repo-name-" + number;
        System.out.println(repoName);
    }
}
