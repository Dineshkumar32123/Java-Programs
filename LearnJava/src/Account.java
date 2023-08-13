//public class Main {
//    public static void main(String args[]) {
//      final int a = 30;
//        int b = 20;
//        int c = a;
////        a = 30;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//
//    }
//}




class  Account
{
    //non static variables
    private String uname;
    private int uid;
    private String pwd;

    //constructor
    Account(String uname,int uid,String pwd)
    {
        this.uname =uname;
        this.uid=uid;
        this.pwd =pwd;
    }

    //getter method for uname
    public String getUname()
    {
        return uname;
    }

    //getter method for uid
    public int getUid()
    {
        return uid;
    }

    //setter method for uid
    public void setUid(int uid)
    {
        this.uid=uid;
    }

    //getter method for pwd
    public String getPwd()
    {
        return pwd;
    }

    //setter method for pwd
    public void setPwd(String pwd)
    {
        this.pwd =pwd;
    }
}
