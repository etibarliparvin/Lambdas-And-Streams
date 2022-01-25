package SDET.streams.part5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// distinct() limit()
// count()
public class Demo1 {
    public static void main(String[] args) {
        List<String> vehicle = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike", "aaron");
        Function<String, Integer> f = p -> {
            int count = 0;
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == 'a') count++;
            }
            return count;
        };
        long count = vehicle.stream().map(f).reduce(0, (a, b) -> a + b);
        System.out.println(count);

        // distinct
        List<String> distinctVehicles = vehicle.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicles);

        // count
        long result = vehicle.stream().distinct().count();
        System.out.println(result);

        // limit
        List<String> limited = vehicle.stream().limit(3).collect(Collectors.toList());
        System.out.println(limited);
    }
}
