import static java.lang.Math.abs;
import java.util.Scanner;

public class code9_11 {
    static String dashInsert (String s) {
        String ret = "";
        if (s.length() < 2)
            return null;
        for (int i = 0; i < s.length() - 1; i++) {
            ret += s.charAt(i);
            if (abs(s.charAt(i) - s.charAt(i + 1)) % 2 == 0)
            {
                if ((s.charAt(i) - '0') % 2 == 0)
                    ret += "*";
                else
                    ret += "-";
            }
        }
        ret += s.charAt(s.length() - 1);
        return ret;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자열을 입력하세요: ");
        System.out.println(dashInsert(sc.nextLine()));
    }
}
