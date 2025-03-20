public class GithubRepoGenerator {
    public static void main(String[] args) {
        // Generate a random 8-character long GitHub repository name with a mix of letters and numbers
        String repoName = generateRandomGitHubRepository();
        System.out.println("Generated GitHub repository name: " + repoName);
    }

    private static String generateRandomGitHubRepository() {
        final int length = 8;
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                // Generate a letter
                chars[i] = Character.valueOf((char) ('a' + (int)(Math.random() * 26)));
            } else {
                // Generate a number
                chars[i] = Character.valueOf((char) ('0' + (int)(Math.random() * 9)));
            }
        }

        // Shuffle the characters to ensure randomness
        Arrays.sort(chars);
        return String.valueOf(chars).substring(0, length);
    }
}
