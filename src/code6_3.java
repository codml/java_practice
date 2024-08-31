import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class code6_3 {
    public static void main(String []args) throws IOException{
        FileWriter fw = new FileWriter("Sample.txt");
        fw.write("Write once, run anywhere");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
        String line = br.readLine();
        System.out.println(line);
    }
}
