package mock2.relationship.is_a_relation.single_level;

public class Mobile extends Battery {
    String mbrand;
    double mprice;

    Mobile(){}
    Mobile(String mbrand,double mprice,int capacity,String bbrand){
        super(capacity,bbrand);
        this.mbrand=mbrand;
        this.mprice=mprice;
    }

    public static void main(String[] args) {
    Mobile m= new Mobile("Vivo",35000,1500,"xel");
        System.out.println("Brand of mobile is: "+m.mbrand);
        System.out.println("Price of mobile is: "+m.mprice);
        System.out.println("Capacity of battery is: "+m.capacity);
        System.out.println("Battery brand is: "+m.bbrand);
    }
}
