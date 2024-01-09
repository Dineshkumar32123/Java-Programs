package mock2.relationship.has_a_relation.aggregation;

//import mock2.relationship.aggregation.Tea;
import mock2.relationship.has_a_relation.aggregation.Tea;
public class Cup {
        String prod;
        Tea t;

        Cup(){}
        Cup(String prod){
            this.prod=prod;
        }
        //helper method
        public void addTea(){
            t = new Tea("Very good",12);
        }
    }

    class CupDriver{
        public static void main(String[] args) {
            Cup c = new Cup("Metal");
            System.out.println(c.prod);
            System.out.println("Details of Tea:");
//        c.addTea();
            System.out.println(c.t.taste);
            System.out.println(c.t.rps);

        }
    }

