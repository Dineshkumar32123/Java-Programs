package mock2.cons;

public class Demo1 {
    String a;
    int b ;
    double c;
    Demo1(){}
    Demo1(String a){
        this();
        this.a = a;
    }
    Demo1(String a, int b){
        this(a);
        this.b = b;
    }
    Demo1(String a, int b , double c){
        this(a,b);
        this.c = c;
    }
}
    class demoDriver{

        //printing
        public static void main(String[] args) {
        Demo1 d = new Demo1();
        Demo1 d1 = new Demo1("Hii");
        Demo1 d2 = new Demo1("Hello",33);
        Demo1 d3 = new Demo1("Three",44,50.0);
            //1st
            System.out.println(d.a);
            System.out.println(d.b);
            System.out.println(d.c);
            System.out.println();
//            //2nd
            System.out.println(d1.a);
            System.out.println(d1.b);
            System.out.println(d1.c);
            System.out.println();
//            //3rd
            System.out.println(d2.a);
            System.out.println(d2.b);
            System.out.println(d2.c);
            System.out.println();
//            //4th
            System.out.println(d3.a);
            System.out.println(d3.b);
            System.out.println(d3.c);
        }
    }
