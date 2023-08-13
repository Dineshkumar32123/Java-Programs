public class Child extends Parent {
    public void text(){
        System.out.println("from child");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.text();
    }
}

