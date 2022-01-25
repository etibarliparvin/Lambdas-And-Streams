package udemy.section10;

import java.util.stream.IntStream;

public class NumericStreamExample {
    public static void main(String[] args) {
        IntStream intStream1 = IntStream.rangeClosed(1, 6);
        IntStream intStream2 = IntStream.range(1, 6);
        intStream1.forEach(System.out::println);
        intStream2.forEach(System.out::println);
    }
}
