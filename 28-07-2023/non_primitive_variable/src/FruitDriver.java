public class FruitDriver {
    public static void main(String[] args){
        //upcating apple to fruit
        Fruit f = new Apple();
        //downcasting
        Apple a = (Apple) f;
        System.out.println(f.fruit_price);
        System.out.println(a.Apple_price);
        //upcasting for mango to fruit
        Fruit f1 = new Mango();
        //downcasting
        Mango m = (Mango) f1;
        System.out.println(f1.fruit_price);
        System.out.println(m.Mango_price);
    }
}
