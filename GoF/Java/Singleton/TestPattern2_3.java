public class TestPattern2_3 {
    static int nNum = 0;
    public static void main(String[] args) {
        // 쓰레드별 task
        Runnable task = () -> {
            try {
                nNum++;
                DatabaseSingleStatic database = DatabaseSingleStatic.getInstance(nNum+"번째");
                System.out.println(database.getName());
            }
            catch(Exception e){}
        };

        for (int i =0 ; i <10 ; ++i) {
            Thread t = new Thread(task);
            // Thread 실행순서와 관계없이 의도대로 하나의 인스턴스만 생성
            t.start();
        }
    }
    
}