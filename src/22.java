public class GitHubRepoGenerator {
    public static void main(String[] args) {
        // Example: generating a unique GitHub repository name with specific details
        String projectName = "exampleProject";
        int randomNumber = (int)(Math.random() * 100);
        System.out.println("Generated Github repo name: " + projectName + "-" + randomNumber);
    }
}
