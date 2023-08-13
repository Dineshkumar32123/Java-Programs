public class Swapping {
    public static void main(String[] args) {
//        int a=1;
//        int b=2;
//
//        a=a+b;//3
//        b=a-b;//1
//        a=a-b;//2
//        System.out.println(a);
//        System.out.println(b);
        int a= 10;
        int b=20;
        int c=30;
        a=a+b+c;//10+20+30=60
        b=a-b-c;//60-20-30=10
        c=a-b-c;//60-10-30=20
        a=a-b-c;//60-10-20=30
        System.out.println(a);
        System.out.println(c);
        System.out.println(b);
    }
}
