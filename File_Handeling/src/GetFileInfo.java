import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File f1 = new File("C:Student.txt");
        if (f1.exists()){
            System.out.println("File name: "+f1.getName());
            System.out.println("File path: "+f1.getAbsolutePath());
            System.out.println("Readable: "+f1.canRead());
            System.out.println("writable: "+f1.canWrite());
            System.out.println("Length: "+f1.length());
        }
        else
            System.out.println("File not available");
    }
}
