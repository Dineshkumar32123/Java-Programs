import java.util.*;
class driverq
{
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args)
    {
        int exit=0;
        while(exit==0)
        {
            System.out.println("\t\t\t=======WELCOME TO QSPIDERS=======");
            System.out.println("\t\t\t1.Login\n\t\t\t2.Qspiders Details\n\t\t\t3.Logout\n\t\t\t4.Exit");
            System.out.println("Please enter the option");
            int mainoption=s.nextInt();
            switch(mainoption)
            {
                case 1:
                {
                    qspiders.login();
                    break;
                }
                case 2:
                {
                    if(qspiders.logincheck==0)
                    {
                        System.out.println("\nPlease Login First");
                    }
                    else
                    {
                        qspiders.qspidersdetails();
                    }
                    break;
                }
                case 3:
                {
                    qspiders.logout();
                    break;
                }
                case 4:
                {
                    exit++;
                    System.out.println("Thankyou For Using our Service");
                    break;
                }
                default:
                {
                    System.out.println("Please select valid option");
                }
            }
        }
    }
}
class qspiders
{
    static Scanner s=new Scanner(System.in);
    static int logincheck;
    public static void login()
    {
        System.out.println("Enter the Username");
        String username=s.next();
        System.out.println("Enter the password");
        String password=s.next();
        if(username.equals("partha") && password.equals("dontknow"))
        {
            System.out.println("\nLogin Successfully");
//            logincheck++;
            qspidersdetails();
        }
        else
        {
            System.out.println("\nInvalid Username/Password");
        }
    }
    public static void qspidersdetails()
    {
        int returnmain=0;
        while(returnmain==0)
        {
            System.out.println("\t\t\t=======QSPIDERS DETAILS=======");
            System.out.println("\t\t\t1.Branch\n\t\t\t2.Fees\n\t\t\t3.No.Of.Placements\n\t\t\t4.Return to mainmenu");
            System.out.println("Please enter the option");
            int qdoption=s.nextInt();
            switch(qdoption)
            {
                case 1:
                {
                    System.out.println("BRANCH: VADAPALANI");
                    break;
                }
                case 2:
                {
                    System.out.println("FEES: 35000");
                    break;
                }
                case 3:
                {
                    System.out.println("NO.OF.PLACEMENTS: 1528");
                    break;
                }
                case 4:
                {
                    returnmain++;
                    break;
                }
                default:
                {
                    System.out.println("Please enter Valid option");
                }
            }
        }
    }
    public static void logout()
    {
        if(logincheck==0)
        {
            System.out.println("\nPlease Login First");
        }
        else
        {
            while(true)
            {
                System.out.println("Press 1 to Confirm LOGOUT");
                int logoutop=s.nextInt();
                if(logoutop==1)
                {
                    System.out.println("\nLogout Successfully");
                    logincheck=0;
                    break;
                }
                else
                {
                    System.out.println("Please enter Valid option\n");
                }
            }
        }
    }

}
