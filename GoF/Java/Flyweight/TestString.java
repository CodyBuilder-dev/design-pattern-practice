public class TestString {
    public static void main(String[] args) {
        // String 생성자를 이용해 같은 내용, 다른 객체 선언
        // 결과 : 다른 인스턴스
        String str1 = new String("홍길동");
        String str2 = new String("홍길동");
        // 문자열 리터럴을 이용해 같은 애용, 다른 객체 선언
        // 결과 : 같은 인스턴스(Flyweight 패턴)
        String str3 = "홍길동";
        String str4 = "홍길동";

        // 각 개체의 주소를 찾아보자
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        // 동일성 검사를 해보자
        if (str1 == str2) System.out.println("1=2");
        if (str1 == str3) System.out.println("1=3");
        if (str1 == str4) System.out.println("1=4");
        if (str2 == str3) System.out.println("3=4");
        if (str3 == str4) System.out.println("3=4");
        
        
        System.out.println("Flyweight Pattern");
    }
}