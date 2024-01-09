package inheritance.single_level;

public class SingleLevel_Driver {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.pname); //Ravi
        Child c = new Child();
        System.out.println(c.cname); //Bharani
        System.out.println(c.pname); //ravi

    }
}
