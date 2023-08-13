public class Car1 {
    String brand ;
    String color;
    int price;
    Car1(){   //NO.ARG CONS.
        System.out.println("No arg.");
    }
    Car1(String brand){    //PARA. CONS.
         this.brand=brand;
    }
    Car1(String color,int price){
        this.color=color;
        this.price=price;
    }

    public static void main(String[] args) {
        Car1 c= new Car1();  // obj 1  no arg.
        Car1 c1= new Car1("Alto");  // obj 2  para.
        Car1 c2 = new Car1("Black",50000);  //obj 3

        System.out.println(c1.brand);
        System.out.println(c2.color);
        System.out.println(c2.price);
    }

}
