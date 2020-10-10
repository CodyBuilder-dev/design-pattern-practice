package GoF.Java.Singleton;

public class TestPattern2 {
    static int nNum = 0;
    public static void main(String[] args) {
        // 쓰레드별 task
        Runnable task = () -> {
            try {
                nNum++;
                DatabaseSingle database = DatabaseSingle.getInstance(nNum+"번째");
                System.out.println(database.getName());
            }
            catch(Exception e){}
        };

        for (int i =0 ; i <10 ; ++i) {
            Thread t = new Thread(task);
            // 의도와 달리 모든 thread에서 인스턴스 생성
            t.start();
        }
    }
    
}