package mock2.relationship.has_a_relation.composistion;

//import mock2.relationship.composition.Engine;
import mock2.relationship.has_a_relation.composistion.Engine;

public class Car {
    String cname;
    String price;
    Engine e;
    Car(){}
    Car(String cname, String price,Engine e){
        this.cname=cname;
        this.price=price;
        this.e=e;
    }
    public static void main(String[] args) {
        Car c = new Car("Audi","4500000",new Engine("1000cc","9944"));
        System.out.println(c.e.getengcc());
        System.out.println(c.cname);
        System.out.println(c.price);
        c.e.setengno("55555","55555");
        System.out.println(c.e.getengcc());
        System.out.println(c.e.getEngno());
    }
}
