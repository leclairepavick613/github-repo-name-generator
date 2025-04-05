public class GitHubRepos {
    public static void main(String[] args) {
        // Example of how to generate a Java class name with a specified prefix and suffix
        String prefix = "MyProject_";
        String suffix = "_Generator";
        String className = prefix + new java.util.Random().nextInt(1000) + suffix;
        
        System.out.println(className);
    }
}
