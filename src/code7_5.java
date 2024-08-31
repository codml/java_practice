import java.util.Arrays;

public class code7_5 {
    public static void main(String []args) {
        int []numbers = {1,2,3,4,5,6,7,8,9,10,13,16,18,23};
        int [] result = Arrays.stream(numbers)
                .filter(b -> b % 2 == 1)
                .map(b -> b * 2)
                .toArray()
                ;
        for (int n : result)
            System.out.println(n);
    }
}
