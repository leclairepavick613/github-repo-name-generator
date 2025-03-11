import java.util.*;

public class GithubRepoNameGenerator {
    public static String generateGithubRepoName() {
        Random rand = new Random();
        int length = rand.nextInt(5) + 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(26);
            char letter = (char) ('a' + index);
            sb.append(letter);
        }
        return sb.toString().toLowerCase();
    }
}
