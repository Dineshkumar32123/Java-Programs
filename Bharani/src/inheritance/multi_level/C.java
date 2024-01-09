package inheritance.multi_level;

public class C extends B{
    String c;
    C(String c,String b,String a){
        super(b,a);
        this.c=c;
    }
}
