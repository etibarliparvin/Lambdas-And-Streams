package SDET.streams.part6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "one");
        Optional<String> el = stringList.stream().findAny();
        System.out.println(el);
    }
}
