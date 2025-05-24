import java.util.Arrays;

public class RepoNameGenerator {
    public static String generateRepoName() {
        // Randomly choose up to 5 characters from the set of valid repository names (example: "github.com/username/project-name")
        int numChars = new java.util.Random().nextInt(10);
        return Arrays.asList("github", "gitlab", "jenkins", "bitbucket", "vultr").get(numChars - 1) + String.format("%02d", (int)(Math.random() * 9999));
    }
}
