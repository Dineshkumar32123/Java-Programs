public class Assignment_1 {
    public static void main(String[] args) {
//        for(char n1=97; n1<=106; n1++){
//            for(char n2=1; n2<=n1; n2++ ){
//                System.out.print(n2);
////                System.out.print();
//            }
//
//        }
        char count = 97;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print((count)+" ");
                count++;
            }
            System.out.println();
        }
    }
}
