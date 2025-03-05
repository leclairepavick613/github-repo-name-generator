import java.util.Random;

public class GitHubRepoNameGenerator {
    public static String generateName() {
        Random rand = new Random();
        int length = rand.nextInt(10) + 5;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append((char) ('a' + rand.nextInt('z' - 'a' + 1)));
        }
        return builder.toString();
    }
}
