public class Main {
    public static void main(String[] args) {
        int a = 0;
        int count=0;
        int sum=0;
        while(a<=10){
            a++;
            if(a%2==0){
            System.out.println("The even numbers are :"+a);
            count++;
            sum = sum+a;
            }
        }
            System.out.println("the sum of numbers are :"+sum);
            System.out.println("the count of the numbers is :"+count);
    }
}
