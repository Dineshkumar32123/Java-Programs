public class Program {
    Program(){
        System.out.println("Parent cls constructor");
    }
      int a = 300;
}
class  program1 extends Program{
     int a = 10;
    program1(){
        super();
        int a = 33;

        System.out.println(this.a);
    }
    public void m1(){

        int a= 30;
        System.out.println(super.a);
        System.out.println(a);
//        System.out.println(this.a);
    }
    public static  void  main(String[] args) {
         program1 p = new program1();
         p.m1();
    }
}
