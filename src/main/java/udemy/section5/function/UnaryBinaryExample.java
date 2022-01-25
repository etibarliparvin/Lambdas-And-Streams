package udemy.section5.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryExample {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = a -> a.toUpperCase();
        UnaryOperator<Integer> u2 = a -> a + 10;

        System.out.println("Result 1 : " + u1.apply("java"));
        System.out.println("Result 2 : " + u2.apply(10));

        Comparator<Integer>  c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };
        Comparator<Integer> cc = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> bo = BinaryOperator.maxBy(cc);
        BinaryOperator<Integer> bo1 = BinaryOperator.maxBy((a, b) -> a.compareTo(b));
        System.out.println("Binary operator result 1 : " + bo1.apply(2, 3));
    }
}
