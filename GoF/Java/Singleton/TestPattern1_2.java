import 
public class TestPattern1_2 {
    public static void main(String[] args) {
        // 싱글톤 패턴 적용시
        // new 생성자가 아니라 인스턴스 생성함수로 생성
        DatabaseSingle d1 = DatabaseSingle.getInstance("1");
        DatabaseSingle d2 = DatabaseSingle.getInstance("2");
        DatabaseSingle d3 = DatabaseSingle.getInstance("3");
        DatabaseSingle d4 = DatabaseSingle.getInstance("4");
        DatabaseSingle d5 = DatabaseSingle.getInstance("5");

        //new 생성자는 error 발생
        //DatabaseSingle d6 = new DatabaseSingle("5");
        System.out.println("database memory use");
        System.out.println(System.identityHashCode(d1));
        System.out.println(System.identityHashCode(d2));
        System.out.println(System.identityHashCode(d3));
        System.out.println(System.identityHashCode(d4));
        System.out.println(System.identityHashCode(d5));

        System.out.println(d1.getName()+d2.getName());
    }
}