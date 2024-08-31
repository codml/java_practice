import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;

public class code6_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        ArrayList <String> array = new ArrayList<>();
        String line;
        while (true)
        {
            line = br.readLine();
            if (line == null)
                break;
            if (line.contains("python"))
                array.add(line.replaceAll("python", "java"));
            else
                array.add(line);
        }
        br.close();
        String print_line = String.join("\r\n", array);
        PrintWriter pw = new PrintWriter("sample.txt");
        pw.println(print_line);
        pw.close();
    }
}
