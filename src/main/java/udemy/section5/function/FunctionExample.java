package udemy.section5.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> f1 = name -> name.toUpperCase();
        Function<String, String> f2 = s -> s.concat(" features");
        System.out.println("Result : " + f1.apply("java"));
        System.out.println("Result : " + f2.apply("java"));
        System.out.println("Result : " + f1.andThen(f2).apply("java"));
        System.out.println("Result : " + f1.compose(f2).apply("java"));
    }
}
