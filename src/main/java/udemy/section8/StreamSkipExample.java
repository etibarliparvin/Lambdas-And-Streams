package udemy.section8;

import java.util.Arrays;
import java.util.List;

public class StreamSkipExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Integer sum = integers.stream().skip(2).reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
