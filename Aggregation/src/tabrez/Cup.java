package tabrez;

public class Cup {
    //States
    String type,color,made_in;
    //Lazy instantiation
    Coffee is_coffee;

    Cup(){
        //L.I
    }
    Cup(String type, String color, String made_in){
        this.type=type;
        this.color=color;
        this.made_in=made_in;
    }

    public void addCoffee(Coffee c) throws Exception{
        if (is_coffee==null){
            //cup is empty
            Thread.sleep(800);
            System.out.println("Adding coffee...");
            is_coffee=c;
            Thread.sleep(800);
            System.out.println(is_coffee.coffee_name+" coffee added to cup");
        }
        else
        {
            Thread.sleep(800);
            //cup already have coffee
            System.out.println("Can't add coffee...because cup already have coffee");
        }
    }

    public void removeCoffee() throws Exception{
        if (is_coffee!=null){

            //cup contains coffee
            System.out.println("Removing coffee from cup...");
            Thread.sleep(1000);
            is_coffee=null;

            System.out.println("Coffee removed successfully");
        }
        else {
            Thread.sleep(800);
            System.out.println("Cup is empty... can't remove coffee");
        }
    }
    public boolean isCoffeePresent(){
        if (is_coffee==null){
            return false;
        }
        return true;
    }

    public void detailsOfCup()throws Exception{
        Thread.sleep(800);
        System.out.println("Type of the cup: "+type);
        System.out.println("Color of the cup: "+color);
        System.out.println("The cup manufacture from: "+made_in);
    }




}
