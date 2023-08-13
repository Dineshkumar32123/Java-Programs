public class lastDigit {
    public static void main(String[] args) {
        int num = 5643541;
        Lastdigit(num);
    }
    public static void Lastdigit(int num){
        int a = num%10;
        System.out.println("The last Digit of the given num is "+a);
    }
}
