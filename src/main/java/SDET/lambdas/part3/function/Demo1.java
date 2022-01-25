package SDET.lambdas.part3.function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        Function<Integer, Integer> f = n -> n * n;
        System.out.println(f.apply(5));
        Function<String, Integer> f2 = n -> n.length() * n.length();
        System.out.println(f2.apply("Salam"));
    }
}
