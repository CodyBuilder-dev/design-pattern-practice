public class DatabaseSingleThreadSafe {
    //전역에서 사용되는 Database 객체 선언
    private static DatabaseSingleThreadSafe singleton; 
    private String name;

    // 싱글톤 패턴의 생성자는 private로 선언
    private DatabaseSingleThreadSafe(String name) {
        try {
            Thread.sleep(100);
            this.name = name;
        }
        catch(Exception e){}
    }

    // 생성자 대신 외부에서 사용가능한 인스턴스 생성함수 선언
    public static DatabaseSingleThreadSafe getInstance(String name) {
        return singleton;
    }
    public String getName() {
        return this.name;
    }
}