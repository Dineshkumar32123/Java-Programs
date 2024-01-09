public class main {

        public static int k=1;
        main(){
            int k=12;
        }
        static int flare(){
            k=11;
            return k;
        }
        public static void main(String[] args){
            flare();
            new main();
            System.out.println(k);
        }
}
