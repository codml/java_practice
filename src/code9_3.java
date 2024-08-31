import java.util.Arrays;

public class code9_3 {
    public static void main(String []args){
        int [] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int sum = Arrays.stream(A)
                .filter((b) -> b >= 50)
                .sum();
        System.out.println(sum);
    }
}
