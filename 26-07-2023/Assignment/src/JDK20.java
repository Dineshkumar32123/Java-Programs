public class JDK20 extends JDK15 {
    double version20;
    String release_Date20;
    JDK20(double version20,String release_Date20,double version15,String release_Date15,double version10,String release_Date10,double version5,String release_Date5,double version1,String release_Date1){
        super(version15,release_Date15,version10,release_Date10,version5,release_Date5,version1,release_Date1);
        this.version20=version20;
        this.release_Date20=release_Date20;
    }
}
