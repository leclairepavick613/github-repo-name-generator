import java.util.Random;

public class GitHubRepoNameGenerator {
  private static final String[] WORDS = new String[]{
    "amazing", "beautiful", "brilliant", "cool", "elegant", "fascinating", "gorgeous", "impressive", "marvelous", "nice", "outstanding", "perfect", "pretty", "stunning", "terrific", "wonderful"
  };
  private static final String[] ENDINGS = new String[]{
    "-code", "-project", "-repo", "-java", "-programming", "-development", "-java-project", "-github-repository", "-code-generation", "-repo-generator", "-github-repo-name-generator"
  };

  public static String generateRepoName() {
    Random random = new Random();
    int index1 = random.nextInt(WORDS.length);
    int index2 = random.nextInt(ENDINGS.length);
    return WORDS[index1] + ENDINGS[index2];
  }
}