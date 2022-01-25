package udemy.section10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxingExample {
    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
        int sum = list.stream().mapToInt(Integer::intValue).sum();
    }
}
