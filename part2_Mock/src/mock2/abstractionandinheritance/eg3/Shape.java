package mock2.abstractionandinheritance.eg3;

public class Shape implements Rectangle,Triangle,Circle{
    @Override
    public void getAreaOfRectangle(int length,int width){
        int res=length*width;
        System.out.println("The area of Rectangle: "+res);
    }
    public void getAreaOfCircle(double pie,int r){
        double res= pie *(r*r);
        System.out.println("The area of Circle is: "+res);
    }

    public void getAreaOfTriangle(int h,int b){
        int res=(h*b)/2;
        System.out.println("The area of Triangle is: "+res);
    }
}
