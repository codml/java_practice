import java.util.Scanner;
import java.util.ArrayList;

public class code9_6 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList <Integer> arr = new ArrayList<>();
        for (String ss : s.split(",")) {
            arr.add(Integer.parseInt(ss));
        }
        System.out.println(arr.stream().mapToInt(n -> n).sum());
    }
}
