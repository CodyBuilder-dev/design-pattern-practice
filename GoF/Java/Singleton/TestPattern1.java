package GoF.Java.Singleton;

public class TestPattern1 {
    public static void main(String[] args) {
        // 싱글톤 패턴 미적용시
        Database d1 = new Database("1");
        Database d2 = new Database("2");
        Database d3 = new Database("3");
        Database d4 = new Database("4");
        Database d5 = new Database("5");

        System.out.println("database use");
    }
}