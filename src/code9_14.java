import java.util.HashMap;
import java.util.Scanner;

public class code9_14 {
    static HashMap <String, Character> m = new HashMap<>();

    static String makeWord(String [] ss) {
        String ret = "";
        for (String s : ss)
            ret += m.get(s);
        return ret;
    }

    static String makeSentence(String [] ss) {
        String ret = "";

        for (String s : ss) {
            ret += makeWord(s.split(" "));
            ret += ' ';
        }
        return ret.substring(0, ret.length() - 1);
    }

    public static void main(String []args) {
        m.put(".-", 'A');
        m.put("-...", 'B');
        m.put("-.-.", 'C');
        m.put("-..", 'D');
        m.put(".", 'E');
        m.put("..-.", 'F');
        m.put("--.", 'G');
        m.put("....", 'H');
        m.put("..", 'I');
        m.put(".---", 'J');
        m.put("-.-", 'K');
        m.put(".-..", 'L');
        m.put("--", 'M');
        m.put("-.",'N');
        m.put("---",'O');
        m.put(".--.",'P');
        m.put("--.-",'Q');
        m.put(".-.",'R');
        m.put("...",'S');
        m.put("-",'T');
        m.put("..-",'U');
        m.put("...-",'V');
        m.put(".--",'W');
        m.put("-..-",'X');
        m.put("-.--",'Y');
        m.put("--..",'Z');
        Scanner sc = new Scanner(System.in);
        System.out.print("모스부호 입력: ");
        System.out.println(makeSentence(sc.nextLine().split("  ")));
    }
}
