package udemy.section10;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> add = x -> x + 5;
        Stream<Integer> s1 = Stream.iterate(0, add).limit(10);
        s1.forEach(System.out::println);
    }
}
