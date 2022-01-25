package udemy.section5.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> con1 = s -> System.out.println(s.toUpperCase());
        con1.accept("Salam");
    }
}
