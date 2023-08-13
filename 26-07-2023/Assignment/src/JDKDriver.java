import java.util.Scanner;

public class JDKDriver {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        JDK20 jdk = new JDK20(20,"January 2000",15.0,"June 2000",10,"December 2000",5,"March 2001",1.0,"December 2001");
        System.out.println("***************JDK1 DETAILS********************");
        System.out.println("Enter JDK1 version: "+jdk.version1);
        System.out.println("Enter the release date: "+jdk.release_Date1);
        System.out.println("*********************************************");
        System.out.println();
        System.out.println("***************JDK5 DETAILS***************");
        System.out.println("Enter JDK5 version: "+jdk.version5);
        System.out.println("Enter the release date: "+jdk.release_Date5);
        System.out.println();
        System.out.println("***************JDK10 DETAILS***************");
        System.out.println("Enter JDK10 version: "+jdk.version10);
        System.out.println("Enter the release date: "+jdk.release_Date10);
        System.out.println();
        System.out.println("***************JDK15 DETAILS***************");
        System.out.println("Enter JDK15 version: "+jdk.version15);
        System.out.println("Enter the release date: "+jdk.release_Date15);
        System.out.println();
        System.out.println("***************JDK20 DETAILS***************");
        System.out.println("Enter JDK20 version: "+jdk.version20);
        System.out.println("Enter the release date: "+jdk.release_Date20);
    }
}
