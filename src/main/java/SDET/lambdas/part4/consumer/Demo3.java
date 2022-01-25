package SDET.lambdas.part4.consumer;

import java.util.function.Consumer;

// Consumer chaining...
public class Demo3 {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s + " is White");
        Consumer<String> c2 = s -> System.out.println(s + " is having four legs");
        Consumer<String> c3 = s -> System.out.println(s + " is eating grass");

//        c1.andThen(c2).andThen(c3).accept("Cow");
//        c1.andThen(c2.andThen(c3)).accept("Cat");

        Consumer<String> c4 = c1.andThen(c2).andThen(c3);
        c4.accept("Cow");
    }
}
