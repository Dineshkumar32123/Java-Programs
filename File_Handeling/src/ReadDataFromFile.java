import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {
    public static void main(String[] args) throws IOException {
        FileReader fread = new FileReader("C:Student.txt");
        int data = fread.read();
        String res="";
        while (data!=-1){
            char ch=(char)data;
            res=res+ch;
            data= fread.read();
        }
        System.out.println(res);
    }
}
