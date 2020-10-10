package GoF.Java.Strategy;

public class AObj {
    BInterface b;
    
    public AObj() {
        this.b = new BImplement();
    }
    // AObj가 직접 메소드 보유
    public void SomeFunc() {
        System.out.println("AAA");
        System.out.println("BBB");
    }
    // B에 메소드 위임
    public void SomeFuncWithStg() {
        b.funcA();
        b.funcB();
    }
}