package Com.Tabrez;

public class Shekar {
    public static void main(String[] args) {
        Test ref = new Test();
        System.out.println("The color is: "+ref.getColor());
        System.out.println("The age is: "+ref.getAge());
        System.out.println("Updating values...");
        System.out.println("Updating values...");
        ref.setColor("White");
        ref.setAge(30);
        System.out.println("The updated color: "+ref.getColor());
        System.out.println("The updated age:"+ref.getAge());
    }
}
