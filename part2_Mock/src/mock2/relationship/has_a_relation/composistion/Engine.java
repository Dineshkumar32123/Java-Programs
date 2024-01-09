package mock2.relationship.has_a_relation.composistion;

public class Engine {
    private String engcc;
    private String engno;
    Engine(){}
    Engine(String engcc,String engno){
        this.engcc=engcc;
        this.engno=engno;
    }
    public String getengcc(){
        return engcc;
    }


    public void setengno(String engcc, String engno){
        this.engcc=engcc;
        this.engno=engno;
    }
    public String getEngno() {
        return engno;
    }

    public void setEngno(String engno) {
        this.engno = engno;
    }
}
