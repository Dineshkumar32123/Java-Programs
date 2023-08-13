public class Car {
    private String modelName;
    private String colour;
    private String price;

    public Car(String modelName, String colour, String price) {
        this.modelName = modelName;
        this.colour = colour;
        this.price = price;
    }
    public String getmodelName() {
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName=modelName;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price=price;
    }
}








