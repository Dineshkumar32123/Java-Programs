public class HashCode {
    String name;
    int id;
    public HashCode(String name, int id){
        this.name=name;
        this.id= id;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Main main = (Main) o;
//        return id == main.id && name.equals(main.name);
//        return false;
//    }

    @Override
    public int hashCode() {
//        return Objects.hash(name, id);
        return 0;
    }

    public static void main(String[] args) {
        HashCode m1 = new HashCode("Dinesh",123);
        HashCode m2 = new HashCode("Dinesh",321);
//        System.out.println(m1.hashCode()); //81628611
//        System.out.println(m2.hashCode()); //1828972342
//        System.out.println(m1.equals(m2));
//        System.out.println(m2.equals(m1));
        System.out.println(m1.hashCode()); //-963487253
        System.out.println(m1.hashCode()); //-963487253
        System.out.println(m2.hashCode()); //-963487253
    }
}