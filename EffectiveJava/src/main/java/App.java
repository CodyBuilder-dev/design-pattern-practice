import enumtest.EnumTest;
import libtest.RandomTest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static final int[] INTARRAY = {1,2,3};
    public static void main(String[] args) {
        App app = new App();

        //app.randomTest();
//        app.transferToTest();
//        app.stringTest();
//        app.arrayTest();
        app.enumTest();
    }

    public void randomTest() {
        // cnt회만큼 돌면서, n보다 작은 수를 생성한 후, n/2보다 작은지 체크
        int n = 2*(Integer.MAX_VALUE / 3);
        int low = 0;
        int cnt = 1000000;

        for (int i = 0; i <cnt; i++)
            if (RandomTest.random(n) < n/2)
                low++;
        // 50%가 아니라 66% 빈도로 발생
        System.out.println(low);
    }


    public void transferToTest() {
        String url = "https://www.naver.com";
        try(InputStream in = new URL(url).openStream()) {
            in.transferTo(System.out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stringTest() {
        // String이 Sortable을 상속받은 것 확인
        Set<String> s = new TreeSet<>();
        String[] args = {"Alpha","Ace","Zeta","Kill"};
        Collections.addAll(s,args); // 자동으로 정렬되어 나옴
        System.out.println(s);
    }

    public void arrayTest() {
        // array는 static final임에도 불구하고 변경이 가능하다는 것 확인
        // 왜냐? final은 단순히 array 변수에만 적용되고, array 변수가 가리키는 메모리 주소의 값에는 저장되지 않기때문
        System.out.println(INTARRAY[1]); // 2출력
        INTARRAY[1] = 3;
        System.out.println(INTARRAY[1]); // 3출력
    }

    public void enumTest() {
        System.out.println(EnumTest.Apple.FUJI);
        System.out.println(EnumTest.Apple.valueOf("FUJI"));
        System.out.println(EnumTest.Apple.FUJI.toString());
    }
}
