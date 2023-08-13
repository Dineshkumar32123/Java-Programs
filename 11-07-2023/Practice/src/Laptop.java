public class Laptop {
    String name;
    char storage;
    String ram;
    int price;

    Laptop(){
        System.out.println("Fuck You ...");
    }
    Laptop(String name){  //p1
        this.name = name;
    }
    Laptop(char storage){  //p2
        this.storage = storage;
    }
    Laptop(String ram,int price){  //p3
        this.ram=ram;
        this.price=price;
    }
}
