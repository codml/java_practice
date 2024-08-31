import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class code6_4 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문장을 입력하세요: ");
        String line = br.readLine();
        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt", true));
        pw.println(line);
        pw.close();
        BufferedReader brr = new BufferedReader(new FileReader("sample.txt"));
        while (true) {
            line = brr.readLine();
            if (line == null)
                break;
            System.out.println(line);
        }
        brr.close();
    }
}
