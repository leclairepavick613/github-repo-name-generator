import java.util.Random;

public class GitHubRepoNameGenerator {
  private static final Random RANDOM = new Random();

  public static String generateValidGithubRepoName() {
    int nameLength = RANDOM.nextInt(10) + 5;
    char[] chars = new char[nameLength];
    for (int i = 0; i < nameLength; i++) {
      chars[i] = (char) ('a' + RANDOM.nextInt(26));
    }
    return String.valueOf(chars);
  }
}
