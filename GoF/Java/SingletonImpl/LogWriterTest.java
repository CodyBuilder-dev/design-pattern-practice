public class LogWriterTest {
    public static void main(String[] args) {
        LogWriter logger;

        logger = LogWriter.getInstance();
        logger.log("Not Good");

        logger = LogWriter.getInstance();
        logger.log("Good");
    }
}