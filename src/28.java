import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepoGeneratorService {

    private final Faker faker;

    @Autowired
    public RepoGeneratorService(Faker faker) {
        this.faker = faker;
    }

    public String generateRepoName() {
        return faker.name().fullName();
    }
}
