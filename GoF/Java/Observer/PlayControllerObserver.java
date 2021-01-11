import java.util.Observable;
import java.util.Observer;

public class PlayControllerObserver implements Observer {

    Observable observable; // 감시할 Subject
    private boolean bPlay; // 감시대상 변수

    public PlayControllerObserver(Observable o) {
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // 변경 감지시 수행할 동작 정의
        System.out.println("변경이 감지되었습니다!");
        if ( o instanceof PlayController ) {
            PlayController myControl = (PlayController)o;
            // this.bPlay = myControl.getFlag();
            myActControl();
        }
    }

    public void myActControl() {
        System.out.println("동작변경 시작!");
        if (bPlay) System.out.println("동작을 시작합니다");
        else System.out.println("동작을 정지합니다");
        System.out.println("동작변경 완료!");
    }
}