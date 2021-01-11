public class FlyweightFactoryTest {
    public static void main(String[] args){
        FlyweightFactory flyweight = new FlyweightFactory();
        flyweight.getSubject("1");
        flyweight.getSubject("1");
        flyweight.getSubject("2");
        flyweight.getSubject("3");

    }
}