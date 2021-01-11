public class TestClass {
    public static void main(String[] args) {
        MyData md1 = new MyData();
        md1.xPos = 1;
        md1.yPos = 2;
        md1.name = "홍길동";

        MyData md2 = new MyData();
        // md2가 가리키는 메모리 주소를 md1에 동일하게 연결한다
        // 즉, 얕은 복사에 해당한다
        md2 = md1;

        MyData md3 = new MyData();
        md3.xPos = 12;
        md3.yPos = 23;
        md3.name = "홍길동";


        System.out.println(System.identityHashCode(md1.name));
        System.out.println(System.identityHashCode(md2.name));
        System.out.println(System.identityHashCode(md3.name));

        // md2 가 가리키는 값 변경시, md1도 같이 변한다
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