public class Main {
    public static void main(String[] args) throws Exception{
        int n = 5;
        for(int i=0; i<n ;i++) {
            for (int j = 0; j < n; j++) {  //Letter--D
                if ((i == 0 && j <= n / 2 + 1) || i == j - 3 || i == n / 2 && j == n / 2 + 2 || i == n / 2 + 1 && j == n / 2 + 2 || (i == 4 && j <= n / 2 + 1) || j == 1) {
                    Thread.sleep(200);
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print(" ");



            for (int j = 0; j < n; j++) {  //Letter--I
                if (i == 0 || j == n / 2 || i == n-1) {
                    Thread.sleep(200);
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print(" ");



            for (int j = 0; j < n; j++) {  //Letter--N
                if (j == 0 || i==j || j == n-1) {
                    Thread.sleep(200);
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print(" ");



            for (int j = 0; j < n; j++) {  //Letter--E
                if (j==0||i==0||i==n/2||i==n-1) {
                    Thread.sleep(200);
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print(" ");



            for (int j = 0; j < n; j++) {  //Letter--S
                if ((j==0&&i<=n/2)||i==n/2||i==0||(j==4&&i>=n/2)||i==n-1) {
                    Thread.sleep(200);
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.print(" ");

            for(int j=0;j<n;j++){ //Letter--H
                if(j==0||i==n/2||j==n-1){
                    Thread.sleep(200);
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}