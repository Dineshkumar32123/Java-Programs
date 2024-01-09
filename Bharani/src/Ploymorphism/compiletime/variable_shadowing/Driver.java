package Ploymorphism.compiletime.variable_shadowing;

public class Driver {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.a);//cat
        Dog d = new Dog();
        System.out.println(d.a);//Dog
        Animal a = new Animal();
        System.out.println(a.a);//Animal
    }
}
