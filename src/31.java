public class MyJavaClass {
    private String description;

    public MyJavaClass(String description) {
        this.description = description;
    }

    // Add more methods as needed

    @Override
    public String toString() {
        return "MyJavaClass{" +
                "description='" + description + '\'' +
                '}';
    }
}
