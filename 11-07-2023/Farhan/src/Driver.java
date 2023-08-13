class Driver{
    public static void main(String[] args) {
        Car audi = new Car("Audi", "null", "Rs.100000");
        System.out.println(audi.getmodelName());
        System.out.println(audi.getColour());
        System.out.println(audi.getPrice());

        audi.setColour("Black");
        System.out.println(audi.getColour());
    }
}
