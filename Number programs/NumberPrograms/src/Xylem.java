public class Xylem {
    public static void main(String[] args) {
        int num = 154;  //231
        int last = num%10;  //1
        int sum = 0; //sum =0
        num = num/10;  //num=23

        while (num>9){
            sum = sum+num%10;  //0+1--->1    1+3=4
            num=num/10;    //23    2
        }
        int f_l=num+last;
        if(sum==f_l){
            System.out.println("The given num is xylem");
        }
        else
            System.out.println("The given num is phloem");
    }
}
