package udemy.section8;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = integers.stream().mapToInt(i -> i).sum();
        System.out.println(sum);
        System.out.println(integers.stream().mapToInt(i -> i).count());
        int sum2 = integers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum2);
    }
}
