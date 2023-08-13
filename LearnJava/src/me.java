
import java.util.Scanner;

class me
{
    static Scanner s = new Scanner(System.in);
    static boolean flag = true;
    public static void main(String[] args)
    {

        System.out.println("Enter the user name:");
        String uname = s.next();
        System.out.println("Enter the user id :");
        int uid = s.nextInt();
        System.out.println("Enter the password:");
        String pwd = s.next();

        //Obj creation for account
        Account acc = new Account(uname,uid,pwd);
        do{
            //switch case
            System.out.println("Choose the task : \n1.Get User Name \n2.Get User Id \n3.Change User Id \n4.get Password \n5.Change password");
            int choice = s.nextInt();
            switch(choice)
            {
                case 1 :
                {
                    System.out.println("User Name : " + acc.getUname());
                }
                break;
                case 2:
                {
                    System.out.println("User id : " + acc.getUid());
                }
                break;
                case 3:
                {
                    System.out.println("Enter the user id : " );
                    int sid = s.nextInt();
                    acc.setUid(sid);
                    System.out.println("********User id updated!..*********");
                }
                break;
                case 4:
                {
                    System.out.println("Password : " + acc.getPwd());
                }
                break;
                case 5:
                {
                    System.out.println("Enter the pwd : " );
                    String pwd1 = s.next();
                    acc.setPwd(pwd1);
                    System.out.println("********Password updated!..*********");
                }
                break;
                default:
                {
                    System.out.println("Enter the correct option sir!....");
                }
                break;
            }
        }
        while(flag);
    }
}
