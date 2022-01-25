package udemy.section8;

import udemy.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        List<Integer> odd = Arrays.asList(1, 3, 5, 7);
        List<Integer> even = Arrays.asList(2, 4, 6, 8);
        List<List<Integer>> listOfList = Arrays.asList(odd, even);
        System.out.println(listOfList);
        System.out.println("----------------------------");
        List<Integer> integers = listOfList.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(integers);

        List<List<String>> hobbies = PersonRepository.getAllPersons().stream().map(x -> x.getHobbies()).collect(Collectors.toList());
        List<String> hobbies2 = PersonRepository.getAllPersons().stream().flatMap(x -> x.getHobbies().stream()).collect(Collectors.toList());
        List<String> hobbies3 = PersonRepository.getAllPersons().stream().flatMap(x -> x.getHobbies().stream()).distinct().collect(Collectors.toList());
        System.out.println(hobbies);
        System.out.println(hobbies2);
        System.out.println(hobbies3);
    }
}
