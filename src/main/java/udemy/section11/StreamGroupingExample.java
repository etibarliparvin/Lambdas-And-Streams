package udemy.section11;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingExample {
    public static void main(String[] args) {
        Map<String, List<Person>> groupedDate = PersonRepository.getAllPersons().stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupedDate.entrySet().forEach(System.out::println);
        Map<String, List<Person>> grouped = PersonRepository.getAllPersons().stream().collect(Collectors.groupingBy(p -> p.getHeight() >= 140 ? "Tallest" : "Shortest"));
        System.out.println(grouped);
        System.out.println("----------------------------");
        Map<String, Map<String, List<Person>>> collect = PersonRepository.getAllPersons().stream().collect(Collectors.groupingBy(Person::getGender, Collectors.groupingBy(p -> p.getHeight() >= 140 ? "Tallest" : "Shortest")));
        System.out.println(collect);
        System.out.println("-----------------------------");
        Map<String, Integer> collect1 = PersonRepository.getAllPersons().stream().collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getKids)));
        System.out.println(collect1);
        System.out.println("----------------------------------");
        Map<String, Integer> collect2 = PersonRepository.getAllPersons().stream().collect(Collectors.toMap(Person::getName, Person::getHeight));
        System.out.println(collect2);
        System.out.println("------------------------------------");
        Map<String, Integer> collect3 = PersonRepository.getAllPersons().stream().collect(Collectors.toMap(Person::getName, Person::getKids));
        System.out.println(collect3);
        
    }
}
