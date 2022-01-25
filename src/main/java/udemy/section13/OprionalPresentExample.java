package udemy.section13;

import java.util.Optional;

public class OprionalPresentExample {
    public static void main(String[] args) {
        Optional<String> ofNullable = Optional.ofNullable("java8");
        System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());
        ofNullable.ifPresent(s -> System.out.println(s));
    }
}
