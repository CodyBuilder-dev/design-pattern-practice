public class LogWriterTestThread {
    public static void main(String[] args) {
        for (int i = 0 ; i<50 ; ++i) {
            Thread t = new ThreadSub(i);
            t.start();
        }
        
    }
}

class ThreadSub extends Thread {
    int num;

    public ThreadSub(int num) {
        this.num = num;
    }

    public void run() {
        LogWriter logger;

        logger = LogWriter.getInstance();
        logger.log("*** " + this.num+ " ***");
    }
}