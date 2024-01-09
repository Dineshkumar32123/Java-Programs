import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoFile {
    public static void main(String[] args) throws IOException {
        FileWriter fwrite = new FileWriter("C:Student.txt");
        fwrite.write("Dinesh");
        fwrite.close();
        System.out.println("Data entered successfully");
    }
}
