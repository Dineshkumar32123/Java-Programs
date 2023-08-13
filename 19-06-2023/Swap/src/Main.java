public class Main {
    public static void main(String[] args) {
        int a=10,b=20;
        int c=a;
//        int d;
        System.out.println("Before swapping of given num is: "+a+" "+b);
         swap(a,b,c);
    }
    public static void swap(int a,int b,int c){

        a=b; //20
        b=c; //10
        System.out.println("after swapping: "+a+" "+b);
    }
}