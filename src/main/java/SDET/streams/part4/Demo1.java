package SDET.streams.part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        // map
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = list1.stream().map(n -> n + 10).collect(Collectors.toList());;

        // flatMap
        List<Integer> l1 = Arrays.asList(1, 2);
        List<Integer> l2 = Arrays.asList(3, 4);
        List<Integer> l3 = Arrays.asList(5, 6);

        List<List<Integer>> finalList = Arrays.asList(l1, l2, l3);

        List<Integer> collect = finalList.stream().flatMap(x -> x.stream().map(e -> e + 10)).collect(Collectors.toList());
        List<Integer> result = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(collect);
    }
}
