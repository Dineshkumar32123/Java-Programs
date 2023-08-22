package tabrez;

public class Sim {
    String sim_name;
    String ph_no;
    int price;
    String bandwidth;

    Sim(){
        //L.I
    }
    Sim(String sim_name,String ph_no, int price,String bandwidth){
        this.sim_name=sim_name;
        this.ph_no=ph_no;
        this.price=price;
        this.bandwidth=bandwidth;
    }

    //Behaviour
    public void detailsOfSim(){
        System.out.println("Sim name is: "+sim_name);
        System.out.println("Phone number is: "+ph_no);
        System.out.println("sim price is: "+price);
        System.out.println("Bandwidth of sim: "+bandwidth);
    }
}
