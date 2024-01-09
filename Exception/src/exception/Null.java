package exception;

public class Null {
    public static void main(String[] args) {
        try {
            String s = "Hii bro";
            System.out.println(s.charAt(10));
        }catch(StringIndexOutOfBoundsException s){
            System.out.println("Exception is handled...");
        }
        try {
            int a = 3 / 0;
            System.out.println(a);
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic exception handled...");
        }
    }
}
