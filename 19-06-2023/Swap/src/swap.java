public class swap {
    public static void main(String[] args) {
        int a = 2;
        int b=3;
//        int c=a;
        System.out.println("The values before swapping:"+a+" "+b);
        a = a*b; //6

        b = a/b; //6/3-->2

        a=a/b; //6/2-->3
        System.out.println("the values after swapping:"+a+" "+b);
    }
}
