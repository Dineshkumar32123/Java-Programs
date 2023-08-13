public class Main {
    public static void main(String[] args) {
        int n =5;
        for(int i=1; i<=n; i++) {
            for(int j=5;j>=i;j--) {
                if (true) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}