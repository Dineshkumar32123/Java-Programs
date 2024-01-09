package Encapsulation;

public class Dog_Driver {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.setColor("white");
        System.out.println(d.getColor());
        d.setLeg(2);
        System.out.println(d.getLeg());

    }
}
