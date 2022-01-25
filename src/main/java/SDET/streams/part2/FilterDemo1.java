package SDET.streams.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);
        Predicate<Integer> p = t -> t % 2 == 0;
        List<Integer> evenNumber = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> evenNumber2 = numberList.stream().filter(p).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
