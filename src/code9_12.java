import java.util.Scanner;

public class code9_12 {
    static String compress(String s) {
        String ret = "" + s.charAt(0);
        char ch = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (ch != s.charAt(i)) {
                ret += String.valueOf(cnt);
                ret += s.charAt(i);
                ch = s.charAt(i);
                cnt = 1;
            }
            else {
                cnt++;
            }
        }
        ret += String.valueOf(cnt);
        return ret;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        System.out.println(compress(sc.nextLine()));
    }
}
