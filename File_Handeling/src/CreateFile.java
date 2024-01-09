import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:Student.txt");
        if (f1.createNewFile()){
            System.out.println("File: "+f1.getName()+" is created");
        }
        else
            System.out.println("File is already created");
    }
}
