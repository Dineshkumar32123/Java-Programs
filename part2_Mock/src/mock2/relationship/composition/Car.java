package mock2.relationship.composition;

public class Car {
    private String cname;
    private String color;
    private int cnum;
    Engine e;

    Car(){}
    Car(String cname,String color, int cnum, Engine e){
        this.cname=cname;
        this.color=color;
        this.cnum = cnum;
        this.e=e;

    }

    public static void main(String[] args) {


        Car cref = new Car("Audi", "Blue", 3333, new Engine(10000, 9875));
        System.out.println("Details of car");
        System.out.println(cref.cname);
        System.out.println(cref.color);
        System.out.println(cref.cnum);
        System.out.println("Details of engine");
        System.out.println(cref.e.engcc);
        System.out.println(cref.e.engno);

    }

}
