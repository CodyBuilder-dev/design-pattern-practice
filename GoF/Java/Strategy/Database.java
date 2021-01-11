public abstract class Database {
    public String name;

    public void connectDatabase(){
        System.out.println(this.name +"에 접속했습니다");
    }

    public void selectData() {
        System.out.println(this.name + "에 SELECT 수행합니다.");
        System.out.println("Select Complete");
    } 

    public void insertData() {
        System.out.println(this.name + "에 INSERT 수행합니다.");
        System.out.println("Insert Complete");
    }
}