public class LoadingProcess {
    String s = "Qsp";


    public void QspDetails(){
        System.out.println("Qsp vadapalani");
    }
    static {
        System.out.println("NSMLI");  //1
    }

    public static void main(String[] args) {
        int a =1;
        LoadingProcess q = new LoadingProcess();
        System.out.println(q.s);   //2
        q.QspDetails();  //3

    }
}
