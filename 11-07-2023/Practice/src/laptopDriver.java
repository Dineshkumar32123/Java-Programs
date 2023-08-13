public class laptopDriver {
    public static void main(String[] args) {
        Laptop l = new Laptop(); //NO. ARG
        Laptop l1=new Laptop("Asus"); //PARA. CONS 1
        Laptop l2=new Laptop('8');
        Laptop l3=new Laptop("16GB",54000);

        System.out.println(l1.name);
        System.out.println(l2.storage);
        System.out.println(l3.ram);
        System.out.println(l3.price);
    }
}
