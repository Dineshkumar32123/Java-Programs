import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int num= s.nextInt();
        int x=0; //remainder
        int y = 0; //reverse
        reverse(num,x,y);
    }
    public  static void reverse(int num,int x,int y){
        int n;
        for(int i=num;num!=0;){ //doubt
            x=num%10;
            num=num/10;
            y=y*10+x;
        }
        System.out.println("The reverse of given number is :"+y);
    }
}
