package GoF.Java.Bridge;

public class IAction {
    private IRobot robot;

    public IAction(IRobot robot) {
        this.robot = robot;
    }

    // 멤버변수의 클래스인 IRobot기능을 그대로 구현함.
    void powerOn(){
        this.robot.powerOn();
    }
 
    void powerOff(){
        this.robot.powerOff();
    }
}