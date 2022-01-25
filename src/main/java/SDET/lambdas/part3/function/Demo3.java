package SDET.lambdas.part3.function;

import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = n -> n * 2;
        Function<Integer, Integer> f2 = n -> n * n * n;
        System.out.println(f1.andThen(f2).apply(3));
        System.out.println(f2.compose(f1).apply(3));
        System.out.println("-------------------------");
        System.out.println(f1.compose(f2).apply(3));
        System.out.println(f2.andThen(f1).apply(3));
    }
}
