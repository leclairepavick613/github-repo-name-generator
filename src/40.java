public class MyGenerator {
    public void generateRepoName() {
        // Example: 1234567890
        String prefix = "github-repo-generator";
        String suffix = "java";

        // Generate a random name and description
        String repoName = prefix + "-" + Math.random().toString(36) + "." + suffix;
        String desc = "This is a Java repository for my GitHub projects.";

        System.out.println(repoName);
        System.out.println(desc);
    }

    public static void main(String[] args) {
        new MyGenerator().generateRepoName();
    }
}
