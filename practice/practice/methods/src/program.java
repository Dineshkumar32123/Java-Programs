import java.util.Scanner;

public class program {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Saptiya ilaya...?");
        String res = sc.next();
        Thread.sleep(1000);
        String yes="saptan";
        String No="ila";
        if (res.equals(yes)){
            System.out.println("Ena sapta...evlo sapta..?");
            String qsn=sc.next();
            Thread.sleep(800);
            String ans1="idly";
            switch ("idly"){
                case "idly":{
                    System.out.println("Ethana idly..?");
                    int idly_ans = sc.nextInt();
                    Thread.sleep(1000);
                    System.out.println("Oooo podhuma pa....!");
                    String idly_ans2 = sc.next();
                    Thread.sleep(1000);
                    System.out.println("Mooditu olunga adhigama sapdu..");
                    String idly_ans3=sc.next();
                    Thread.sleep(1000);
                    System.out.println("En cute uhhh😁");
                }break;
            }
        }else if (res.equals(No)){
            System.out.println("Mooditu poitu olunga saptu va...");
        }
        else
            System.out.println("saptiya ilaya nu ketan 😡");
    }
}
//                case "rice":{
//                    Thread.sleep(1000);
//                    System.out.println("seringaa husband!!!");
//                }break;
//                case 3:{}break;
