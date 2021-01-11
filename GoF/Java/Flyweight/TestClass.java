public class TestClass {
    public static void main(String[] args) {
        MyData md1 = new MyData();
        md1.xPos = 1;
        md1.yPos = 2;
        md1.name = "홍길동";

        MyData md2 = new MyData();
        md2 = md1;

        MyData md3 = new MyData();
        md3.xPos = 12;
        md3.yPos = 23;
        md3.name = "홍길동";

        System.out.println(System.identityHashCode(md1.name));
        System.out.println(System.identityHashCode(md3.name));

        md2.name = "손오공";
        md2.xPos = 5;

        
        System.out.println("클래스 테스트!");
    }
}

class MyData {
    int xPos;
    int yPos;
    String name;
}