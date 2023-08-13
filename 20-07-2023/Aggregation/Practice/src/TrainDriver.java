public class TrainDriver {
    public static void main(String[] args) {
        Train t = new Train("123","456");
        System.out.println(t.tno);
        System.out.println(t.cno);
        t.addTrain();
        System.out.println(t.p.pname);
        System.out.println(t.p.age);
    }
}
