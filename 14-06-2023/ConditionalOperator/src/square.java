public class square {
    public static void main(String[] args) {
        int a=10;
        square(a);
        cube(a);
    }
    public static void square(int a){
        int num = a*a;
        System.out.println("The square of the given value is "+num);
    }
    public static void cube(int a){
        int num = a*a*a;
        System.out.println("The cube of the given number is "+num);
    }
}
