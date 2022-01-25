package SDET.streams.part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
        List<String> teamC = Arrays.asList("Ken", "Johny", "Kitty");

        List<List<String>> players = new ArrayList<>();
        players.add(teamA);
        players.add(teamB);
        players.add(teamC);

        List<Integer> collect = players.stream().flatMap(p -> p.stream().map(s -> s.length())).collect(Collectors.toList());
        List<String> collect2 = players.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect2);
    }
}
