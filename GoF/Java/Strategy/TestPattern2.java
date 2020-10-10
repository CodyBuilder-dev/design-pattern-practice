package GoF.Java.Strategy;

public class TestPattern2 {
    public static void main(String[] args) {
        
        DatabaseUse mydb = new DatabaseUse();

        // MySQL
        mydb.setDatabase("MySQL");
        mydb.selectData();

        // Oracle
        mydb.setDatabase("Oracle");
        mydb.selectData();

        // 요구사항 : 만약 Tibero 연결이 추가로 필요하게 된다면?
        // 기존 방식으로는 비정상동작(Switch-case에 Tibero 없음)
        mydb.setDatabase("Tibero");
        mydb.selectData();

        // DI방식으로는 정상동작
        mydb.setDatabaseWithStrategy(new Tibero());
        mydb.selectData();
    }
}