import java.util.Scanner;

public class code9_15 {
    static String ceesar (String s, int num) {
        char [] arr = s.toCharArray();
        String ret = "";
        for (char ch : arr)
        {
            if (ch + num > 'Z')
                ret += (char)(ch + num - ('Z' + 1) + 'A');
            else
                ret += (char)(ch + num);
        }
        return ret;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Encode: ");
        String s = sc.nextLine();
        System.out.print("How: ");
        int num = sc.nextInt();
        System.out.println(ceesar(s, num));
    }
}
