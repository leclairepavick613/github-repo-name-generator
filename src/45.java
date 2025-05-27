import org.javatuples.Pair;

public class RepoNameGenerator {
    public static String generateRepoDescription() {
        // Example: Create a new GitHub repository named "example-project"
        Pair<String, String> repoDescription = Pair.with("example-project", "This is an example of a Java project created with the GitHub-repo-name-generator code generator.");
        return repoDescription.first + " by " + repoDescription.second;
    }

    public static void main(String[] args) {
        System.out.println(generateRepoDescription());
    }
}
