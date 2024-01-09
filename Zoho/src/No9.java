public class No9 {
    public static int k = 1;
    No9(){
        int k = 12;
    }
    static int flare(){
        k = 11;
        return k;
    }
    public static void main(String[] args) {
        flare();
        new No9();
        System.out.println(k);
    }
}
