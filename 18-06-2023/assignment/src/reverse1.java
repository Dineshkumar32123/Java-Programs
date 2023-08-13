public class reverse1 {
    public static void main(String[] args) {
        int num = 12345;
        int rem;
        int rev = 0;
        for(int i = num;num!=0;){
            rem=num%10; //5
            num=num/10; //1234
            rev=rev*10+rem; //5 4
        }
        System.out.println("The reverse of given number is :"+rev);
    }
}
