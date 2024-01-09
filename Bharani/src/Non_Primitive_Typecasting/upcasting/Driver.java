package Non_Primitive_Typecasting.upcasting;
public class Driver {
    public static void main(String[] args) {
        //obj for Animal
        Animal a = new Animal("cow");
        System.out.println(a.A_name);//Cow

//        System.out.println(a.D_name);//Error

        //obj for Dog
        Dog d = new Dog("dog","Donkey");
        System.out.println(d.D_name);//Dog
        System.out.println(d.A_name);//Donkey

        //Upcasting
        Animal  ref = new Dog("dog","coww");
        System.out.println(ref.A_name);//coww
        //  System.out.println(ref.D_name);//Error

        //Downcasting
        Dog edhaachi = (Dog) ref;
        System.out.println(edhaachi.A_name);//cow
        System.out.println(edhaachi.D_name);//dog
    }
}
