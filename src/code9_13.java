import java.util.Scanner;
import java.util.Arrays;

public class code9_13 {
    static boolean chkDupNum(String s) {
        int [] arr = new int [10];
        Arrays.fill(arr, 0);
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
        }
        int []com = Arrays.stream(arr)
                .filter(b -> b == 1)
                .toArray();
        return com.length == 10;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            String s = sc.nextLine();
            if (s.equals("0"))
                break;
            System.out.println(chkDupNum(s));
        }
    }
}
