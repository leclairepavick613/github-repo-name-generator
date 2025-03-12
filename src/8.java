
import java.util.Random;

public class GitHubRepoNameGenerator {
    private static final String[] NAMES = new String[]{
        "github",
        "repositories",
        "repository",
        "programming",
        "software",
        "development",
        "project",
        "git",
        "version-control",
        "source-code"
    };

    private static final String[] DESCRIPTIONS = new String[]{
        "Create a new repository on GitHub",
        "Explore the world of open source software",
        "Discover new programming languages and tools",
        "Contribute to the open source community",
        "Manage your projects with ease"
    };

    private static Random random = new Random();

    public static String generateName() {
        return NAMES[random.nextInt(NAMES.length)];
    }

    public static String generateDescription() {
        return DESCRIPTIONS[random.nextInt(DESCRIPTIONS.length)];
    }
}