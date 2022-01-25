package udemy.section8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Pineapple");
        Map<String, Integer> map = fruits.stream().collect(Collectors.toMap(x -> x, String::length));
        System.out.println(map);
    }
}
