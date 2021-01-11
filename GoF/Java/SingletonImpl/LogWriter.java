import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWriter {
    private static LogWriter singleton = new LogWriter();
    private static BufferedWriter bw;

    private LogWriter(){
        try {
            bw = new BufferedWriter(new FileWriter("log.txt"));
        } catch (Exception e) {}
    }

    public static LogWriter getInstance() {
        return singleton;
    }

    public synchronized void log(String str){
        try {
            bw.write(str+"\n");
            bw.flush();
        } catch (Exception e) {}
    }
    protected void finalize() {
        try {
            bw.close();
        } catch (Throwable ex) {}
    }
}