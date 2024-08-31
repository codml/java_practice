import java.util.HashMap;

public class code9_2 {
    public static void main(String []args) {
        HashMap <String, Integer> m = new HashMap<>();
        m.put("A", 90);
        m.put("B", 80);
        System.out.println(m.getOrDefault("C", 70));
    }
}
