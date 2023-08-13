public class mobileDriver {
    public static void main(String[] args) {
        Mobile m = new Mobile("Iqoo","Black","8GB",35000,"128gb");
        m.setBrand("Vivo");
        System.out.println(m.brand);
        m.setColor("Blue");
        System.out.println(m.color);
        System.out.println(m.gb);
        System.out.println(m.price);
        System.out.println(m.storage);
    }
}
