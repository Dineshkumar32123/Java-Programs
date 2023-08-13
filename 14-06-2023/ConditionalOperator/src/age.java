//import java.util.Scanner;
public class age {
//    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter the char ");
//        char a = sc.next().charAt(0);
//        System.out.println("The entered char is :"+a);
        char c = 98;
        if(c>=65&&c<=90){
            System.out.println("The given character is upper alphabet");
        }
        else if (c>=97&&c<=122){
            System.out.println("The given character is lower alphabet ");
        }
        else if (c>=48&&c<=57){
            System.out.println("The given character is number ");
        }
        else{
            System.out.println("The given character is spl characters");
        }
    }

}
