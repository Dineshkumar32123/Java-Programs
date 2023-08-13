public class Animal {
    public void m1(){
        System.out.println("Animal is executing...");
    }
}

class Dog extends Animal{
    public void m2(){
        System.out.println("Dog is executing...");
    }
}

class Puppy extends Dog{
    public void m3(){
        System.out.println("puppy is executing...");
    }
}
class AnimalDriver{
    public static void main(String[] args) {
        //obj for animal
        Animal a = new Animal();
        //obj for Dog
        Dog d= new Dog();
        //obj for puppy
        Puppy p = new Puppy();
        //using animal obj
        a.m1(); //Animal is executing
//        a.m2(); // Error
        //using dog obj
        d.m1(); //Animal is executing
        d.m2(); //Dog is executing
        //using puppy obj
        p.m3(); //puppy is executing
        p.m2(); //Dog is executing
        p.m1(); //Animal is executing
    }
}

