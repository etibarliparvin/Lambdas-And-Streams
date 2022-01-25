package udemy.section8;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sam", "Anderson", "Peter", "Nancy");
        names.stream().filter(s -> s.length() > 4).forEach(System.out::println);
    }
}
