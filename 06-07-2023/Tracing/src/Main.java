import java.sql.SQLOutput;

public class Main {
    String a = "Hii";
    Main(){
        System.out.println("MLNSI");
    }

    public  void method1() {
        System.out.println("method1() is executing..");
    }
    public static void main(String[] args) {
        System.out.println("Before obj ");   //1
        Main m = new Main();    //2.MLNSI
        Main n = new Main();    //3.MLNSI
        m.method1();  //4.m1() is exe..
        n.method1();
        System.out.println(m.a);
        System.out.println(n.a);
    }
}