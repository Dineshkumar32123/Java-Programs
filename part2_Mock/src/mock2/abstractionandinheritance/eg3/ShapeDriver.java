package mock2.abstractionandinheritance.eg3;

public class ShapeDriver {
    public static void main(String[] args) {
        Shape s =new Shape();
        Rectangle r = new Shape();
        Circle c= new Shape();
        Triangle t = new Shape();


        r.getAreaOfRectangle(10,12);
        c.getAreaOfCircle(3.14,3);
        t.getAreaOfTriangle(4,6);

        }

}
