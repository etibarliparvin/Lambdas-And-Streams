package udemy.section13;

import java.util.Optional;

public class OptionalMethodsExample {
    public static void main(String[] args) {
        Optional<String> of = Optional.of("java8");
        System.out.println(of.get());

        Optional<String> ofNullable = Optional.ofNullable(null);
        System.out.println(ofNullable.orElse("No Data"));
    }
}
