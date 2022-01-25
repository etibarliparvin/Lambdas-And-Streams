package SDET.streams.part6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<Integer> reverse = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverse);
    }
}
