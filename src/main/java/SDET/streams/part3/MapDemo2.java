package SDET.streams.part3;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        list.stream().map(a -> a.length()).forEach(System.out::println);
    }
}
