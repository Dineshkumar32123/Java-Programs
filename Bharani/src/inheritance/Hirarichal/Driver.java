package inheritance.Hirarichal;

public class Driver {
    public static void main(String[] args) {
        Ravi r = new Ravi("150");
        System.out.println(r.height);//150
        Bharani bref = new Bharani("100","120");
        System.out.println(bref.weight);//100
        System.out.println(bref.height);//120
        Bhuvi bhuvi = new Bhuvi("60","200");
        System.out.println(bhuvi.height);//200
        System.out.println(bhuvi.weight);//60
        Swetha swetha = new Swetha("40","250");
        System.out.println(swetha.height);//250
        System.out.println(swetha.weight);//40
    }
}
