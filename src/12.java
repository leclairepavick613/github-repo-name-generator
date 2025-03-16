import java.util.Random;

public class GitHubRepoNameGenerator {
    public static String generateValidGitHubRepoName() {
        Random random = new Random();
        int length = 1 + random.nextInt(64);
        StringBuilder nameBuilder = new StringBuilder();
        while (nameBuilder.length() < length) {
            char c = (char) ('a' + random.nextInt('z' - 'a'));
            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                continue;
            }
            nameBuilder.append(c);
        }
        return nameBuilder.toString();
    }
}
