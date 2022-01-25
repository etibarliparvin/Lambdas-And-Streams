package SDET.streams.part5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // count
        long numOfEven = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println(numOfEven);

        // min
        Optional<Integer> min = numbers.stream().min((a, b) -> a.compareTo(b));
        System.out.println(min.get());

        // max
        Optional<Integer> max = numbers.stream().max((a, b) -> a.compareTo(b));
        System.out.println(max.get());
    }
}
