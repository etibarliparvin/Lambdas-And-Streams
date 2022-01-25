package SDET.streams.part6;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");

        // anyMatch
        boolean result = fruits.stream().anyMatch(el -> el.startsWith("O"));
        System.out.println(result);

        // allMatch
        result = fruits.stream().allMatch(el -> el.startsWith("e"));
        System.out.println(result);

        // noneMatch
        result = fruits.stream().noneMatch(el -> el.startsWith("One"));
        System.out.println(result);
    }
}
