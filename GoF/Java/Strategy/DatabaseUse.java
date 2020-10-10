package GoF.Java.Strategy;

// 데이터베이스 인스턴스의 DI를 위한 Wrapper 클래스
public class DatabaseUse {
    public Database db;

    public DatabaseUse(){
        System.out.println("데이터베이스 사용시작");
    };

    // 불편한 방식
    public void setDatabase(String name) {
        switch (name) {
            case "Oracle" :
                this.db = new Oracle();
                break;
            case "MySQL" :
                this.db = new MySQL();
                break;
            // 만약 Tibero DB에 대한 요구사항이 들어온다면?
            // Switch Case문에 매번 추가해 줘야 함
        }
    }

    // 편한 방식
    public void setDatabaseWithStrategy(Database db) {
        this.db = db;
    }

    public void selectData() {
        this.db.selectData();
    }

    public void insertData() {
        this.db.insertData();
    }
}