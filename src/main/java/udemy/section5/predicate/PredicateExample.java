package udemy.section5.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> lessThan = a -> a <= 50;
        Predicate<Integer> greaterThan = a -> a >= 100;
        Predicate<Integer> equalTo = a -> a == 0;

        System.out.println("Greater than : " + greaterThan.test(150));
        System.out.println("Less than : " + lessThan.test(150));
        System.out.println("Equal : " + equalTo.test(0));

        boolean result1 = lessThan.and(greaterThan).and(equalTo).test(150);
    }
}
