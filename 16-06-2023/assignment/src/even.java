import java.util.Scanner;
public class even {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st value :");
        int m = s.nextInt();                                //step 1--->1st it will execute
        System.out.println("Enter the 2st value :");
        int n = s.nextInt();                                //step 2--->2nd it'll execute
        int count = 0;
        for (int i = m; i <= n; i++) {                      //step.3--->m value goes to i---> 1.initialisation 2.it'll check m value is less nd equal to n.
            if (i % 2 == 0) {                               //step.4--->checks the condition--if it's true goes to nxt line
//                System.out.println("The even number is :"+i); //step.5--->print it
                count++;                                    //step.6--->count will be added by one in line 9
            }                                               //step.7--->next the thread will go to line 10-->updation(i++)
                                                            //int value is added by one then comes to line 10 then repeat the process from step 3 to 7.
        }                                                   //Finally i will reach n value...Thread will come out of loop..line15
        System.out.println("The count of the even numbers are " + count);   //at last this line will be printed and count will be updated here.
    }
}
