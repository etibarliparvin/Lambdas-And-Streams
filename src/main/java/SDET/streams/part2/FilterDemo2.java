package SDET.streams.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cup", null, "forest", "sky", "book", null, "theatre");
        List<String> list = words.stream().filter(s -> s != null).collect(Collectors.toList());
        System.out.println(list);
    }
}
