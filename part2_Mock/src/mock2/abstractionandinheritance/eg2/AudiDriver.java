package mock2.abstractionandinheritance.eg2;

public class AudiDriver {
    public static void main(String[] args) {
        Audi a = new Audi();
        a.start();
        a.accelerate(130);
        a.slowDown(30);
        a.stop();
    }
}
