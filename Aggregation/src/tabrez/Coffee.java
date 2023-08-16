package tabrez;

public class Coffee {
    String coffee_name;
    int price;
    int quantity;
    Coffee(){
        //L.I
    }
    Coffee(String c_name,int c_price, int c_quantity){
        coffee_name=c_name;
        price=c_price;
        quantity=c_quantity;
    }

    //Behaviour
    public void detailsOfCoffee(Coffee c){
        System.out.println("The name of the coffee is: "+this.coffee_name);
        System.out.println("Price of the coffee is: "+this.price+"rs");
        System.out.println("The Quantity of the coffee is: "+this.quantity+"grms");
    }
}
