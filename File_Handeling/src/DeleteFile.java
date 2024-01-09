import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f1 = new File("C:Student.txt");
        if (f1.exists()){
            f1.delete();
            System.out.println("File "+f1.getName()+" is deleted successfully.");
        }
        else
            System.out.println("File is not available");
    }
}
