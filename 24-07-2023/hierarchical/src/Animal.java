public class Animal {
    public  void method1(){
        System.out.println("m1 is executing");
    }
}

 class Dog extends Animal{
     public  void method2() {
         System.out.println("m2 is executing");
     }
}

class Lion extends Animal{
    public void method3(){
        System.out.println("Lion is executing..");
    }
}
class AnimalDriver{
    public static void main(String[] args) {
       Lion l = new Lion(); ////
       l.method3();
       l.method1();
       Dog d= new Dog();////
       d.method1();
       d.method2();
    }
}
