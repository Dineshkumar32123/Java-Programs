package mock2;
//variable shadowing
//It's purely depends upon obj reference
//public class Class1 {
//    int a = 10;
//}
//
// class Class2 extends Class1 {
//    int a = 20;
//}
//class Class3 extends Class2 {
//    int a = 30;
//
//    public static void main(String[] args) {
//        Class1 cl1 = new Class1();
//        Class1 cl2 = new Class2();
//        Class1 cl3 = new Class3();
//        //upcast
//        Class1 c1 = new Class3();
//        System.out.println(c1.a);
//        //downcasting
//        Class3 c3 = (Class3) c1;
//        System.out.println(c3.a);
//    }
//}



class Cab{
    int price;
    Cab(){
        //L.I
    }
    Cab(int price){
        this.price=price;
    }
}

class Mini extends Cab{
    int price;
    Mini(){}
    Mini(int price){
        super(price);
        this.price=price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Macro macro)) return false;
        return price == macro.price;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

class Macro extends Mini{
    int price;
    Macro(){}



    Macro(int price){
        super(price);
        this.price=price;

    }
}

class Sedan extends Macro{
    int price;
    Sedan(){}
    Sedan(int price){
        super(price);
        this.price=price;
    }


}
    class Driver{
        public static void main(String[] args) {
            Cab cb = new Cab(10);
            Mini mni = new Mini(20);
            Macro mro = new Macro(30);
            Sedan sdn = new Sedan(40);
            System.out.println(cb.price);
        }
    }

