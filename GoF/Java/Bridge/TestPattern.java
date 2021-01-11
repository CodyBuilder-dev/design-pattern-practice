public class TestPattern {
    public static void main(String[] args) {
        // robot 객체의 일반적인 구현
        IRobot robot1 = new Robot1();
        IRobot robot2 = new Robot2();

        robot1.powerOn();
        robot1.powerOff();

        robot2.powerOn();
        robot2.powerOff();

        // 만약 robot3 구현의 추가가 필요하게 되면?
        // IRobot robot3 = new Robot3(); 식으로 접근

        // 만약 robot1에 cook의 추가가 필요하다면?
        Cook cook = new Cook(robot1);
        cook.doCook();

        Clean clean = new Clean(robot2);
        clean.doClean();
    }
}