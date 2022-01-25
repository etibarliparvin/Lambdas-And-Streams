package SDET.lambdas.part2.predicates;

// Joining Predicates - and, or, negate
// p1 - checks number is even
// p2 - checks greater than 50

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        Integer[] num = {5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
        Predicate<Integer> p1 = (n) -> n % 2 == 0;
        Predicate<Integer> p2 = (n) -> n > 50;
        System.out.println(p1.and(p2).test(100));
        System.out.println(p1.and(p2).test(20));

        // and
        for (int i = 0; i < num.length; i++) {
            if (p1.and(p2).test(num[i])) System.out.println(num[i]);
        }

        Arrays.stream(num).filter(p1).filter(p2).forEach(System.out::println);
        Arrays.stream(num).filter(p1.and(p2)).forEach(System.out::println);

        // or
        for (int i = 0; i < num.length; i++) {
            if (p1.or(p2).test(num[i])) System.out.println(num[i]);
        }

        // negate
        for (int i = 0; i < num.length; i++) {
            if (p1.negate().test(num[i])) System.out.println(num[i]);
        }
    }
}
