public class Mobile {
    String brand;
    String color;
    String gb;
    int price;
    String storage;

    Mobile() {  //No-argument cons.

    }

    Mobile(String brand, String color, String gb, int price, String storage) {  //para.cons.
        this.brand = brand;
        this.color = color;
        this.gb = gb;
        this.price = price;
        this.storage = storage;
    }
    public String getbrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setColor(String color){
        this.color=color;
    }

}