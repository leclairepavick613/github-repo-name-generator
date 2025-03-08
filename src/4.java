import java.util.Random;

public class GitHubRepoNameGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1000);
        String name = "repo-" + number;
        System.out.println(name);
    }
}
