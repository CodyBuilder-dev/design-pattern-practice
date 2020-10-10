package GoF.Java.Singleton;

public class Database {
    private String name;

    public Database(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}