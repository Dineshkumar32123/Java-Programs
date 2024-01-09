public class MovieDriver {
    public static void main(String[] args) {
        Movie obj1 = new Movie();
        Movie obj2 = new Movie();
        Movie obj3 = new Movie();

        obj1.title="Leo";
        obj1.genre="Action";
        obj1.rating=5;

        obj2.title="Jailer";
        obj2.genre="Thriller";
        obj2.rating=4;

        obj3.title="DD returns";
        obj3.genre="comedy";
        obj3.rating=3;

        obj1.playIt();
        obj2.playIt();
        obj3.playIt();



    }
}
