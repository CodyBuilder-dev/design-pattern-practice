public class PlayControllerObserverTest {
    public static void main(String[] args) {
        PlayController subject = new PlayController();
        PlayControllerObserver observer1 = new PlayControllerObserver(subject);
        PlayControllerObserver observer2 = new PlayControllerObserver(subject);
        // Subject 값 변경
        subject.setFlag(true);
        subject.setFlag(false);
        

    }
}