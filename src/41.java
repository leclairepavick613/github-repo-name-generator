import java.util.Random;

public class RepoNameGenerator {
    private static final String[] GENRES = {"Java", "Python", "C++", "C#", "JavaScript"};

    public static void main(String[] args) {
        Random random = new Random();
        int genreIndex = random.nextInt(GENRES.length);
        System.out.println("Generated Github repo name: " + GENRES[genreIndex]);
    }
}
