package inheritance.multi_level;

public class B extends A{
    String b;
    B(String b,String a){
        super(a);
        this.b=b;
    }
}
