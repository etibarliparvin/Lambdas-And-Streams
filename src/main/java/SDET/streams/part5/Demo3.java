package SDET.streams.part5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");

        // reduce
        Optional<String> reduce = stringList.stream().reduce((a, b) -> a + b);
        System.out.println(reduce.get());
    }
}
