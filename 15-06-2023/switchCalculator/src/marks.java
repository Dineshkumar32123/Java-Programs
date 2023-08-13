import java.util.Scanner;
public class marks {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        double a = mark();
        System.out.println("My mark in 10th is: "+a);
    }
    public static double mark(){
        System.out.println("Enter my mark :");
        double myMark = sc.nextDouble();
        return  myMark;
    }
}
