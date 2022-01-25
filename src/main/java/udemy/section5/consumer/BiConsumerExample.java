package udemy.section5.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> con1 = (a, b) -> System.out.println("Add : " + (a + b));
        con1.accept(3, 2);

        List<Integer> list1 = Arrays.asList(new Integer(10), new Integer(10), new Integer(10));
        List<Integer> list2 = Arrays.asList(new Integer(10), new Integer(10));
        BiConsumer<List<Integer>, List<Integer>> con2 = (a, b) -> {
            if (a.size() == b.size()) System.out.println("True");
            else System.out.println("False");
        };
        con2.accept(list1, list2);
    }
}
