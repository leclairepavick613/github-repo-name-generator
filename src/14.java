import java.util.*;

public class GitHubRepoNameGenerator {
    public static void main(String[] args) {
        // Create a list of words to use as the basis for the repo name
        List<String> wordList = new ArrayList<>();
        wordList.add("cat");
        wordList.add("dog");
        wordList.add("tree");
        wordList.add("table");
        wordList.add("chair");

        // Create a list to store the generated repo names
        List<String> repoNames = new ArrayList<>();

        // Loop through each word in the list and create a repo name by combining it with a random number of other words
        for (String word : wordList) {
            int numWords = 1 + new Random().nextInt(3);
            String repoName = "";
            for (int i = 0; i < numWords; i++) {
                repoName += word + "-";
            }
            repoName = repoName.substring(0, repoName.length() - 1); // Remove the trailing dash
            repoNames.add(repoName);
        }

        // Print out the generated repo names
        for (String repoName : repoNames) {
            System.out.println(repoName);
        }
    }
}
