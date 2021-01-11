public class TestPattern1 {
    public static void main(String[] args) {
        // 전략패턴 없는 단순 생성-호출
        AObj a = new AObj();
        a.SomeFunc();
        a.SomeFuncWithStg();

    }
}