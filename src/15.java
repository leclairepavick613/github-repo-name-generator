import java.util.Random;

public class GitHubRepoNameGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        String name = "";
        for (int i = 0; i < 10; i++) {
            int index = rand.nextInt(26);
            char c = (char) ('a' + index);
            name += c;
        }
        System.out.println(name);
    }
}
