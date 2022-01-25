package SDET.streams.part3;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
