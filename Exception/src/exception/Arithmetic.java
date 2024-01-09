package exception;

public class Arithmetic {
    public static void main(String[] args) {
        try {
            int a = 3;
            int b = 0;
            int res = a / b;
            System.out.println(res);
        }catch(ArithmeticException a){
            System.err.println("You're having the problem in the above lines of code..please aware of it...! ");
        }
    }
}
