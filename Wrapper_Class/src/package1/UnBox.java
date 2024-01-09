package package1;

public class UnBox {
    public static void main(String[] args) {
        //Obj into PDT
//        Byte a = new Byte(99);
        Boolean b1 = new Boolean(true);
        System.out.println(b1);//true--> obj
        boolean b = b1.booleanValue();
        System.out.println(b);//value
    }
}
