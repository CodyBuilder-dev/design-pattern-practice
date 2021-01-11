public class DatabaseSingleStatic {
    //전역에서 사용되는 Database 객체 선언
    private static DatabaseSingleStatic singleton = new DatabaseSingleStatic("Static Name"); 
    private String name;

    // 싱글톤 패턴의 생성자는 private로 선언
    private DatabaseSingleStatic(String name) {
        try {
            Thread.sleep(100);
            this.name = name;
        }
        catch(Exception e){}
    }

    // 생성자 대신 외부에서 사용가능한 인스턴스 생성함수 선언
    public synchronized static DatabaseSingleStatic getInstance(String name) {
        // singleton이 null일때만 DatabaseSingle 인스턴스 생성
        // singleton이 있으면 있는 인스턴스 반환
        if (singleton == null) {
            singleton = new DatabaseSingleStatic(name);
        }
        
        return singleton;
    }
    public String getName() {
        return this.name;
    }
}