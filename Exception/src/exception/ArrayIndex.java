package exception;

public class ArrayIndex {
    public static void main(String[] args) {
        ArrayIndex bref = new ArrayIndex();
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
        }catch(ArrayIndexOutOfBoundsException ar){
            System.out.println(ar.getMessage());

        } catch(Throwable t){
            System.out.println(t.getStackTrace());
        }
    }
}
