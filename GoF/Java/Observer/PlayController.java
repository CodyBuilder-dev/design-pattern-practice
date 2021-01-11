import java.util.Observable;

public class PlayController extends Observable {
    private boolean bPlay; // 실행 여부. 감시대상 변수

    public PlayController() {

    }

    public void setFlag(boolean bPlay) {
        this.bPlay = bPlay;
        setChanged();
        notifyObservers();
    }

    public boolean getFlag() {
        return this.bPlay;
    }
}