package inheritance.Super;

public class Driver {
    public static void main(String[] args) {
        Mobile m = new Mobile("blue");
        System.out.println(m.color);//blue

        Sim s = new Sim(54321,"black");
        System.out.println(s.s_num);//54321
        System.out.println(s.color);//black

    }
}
