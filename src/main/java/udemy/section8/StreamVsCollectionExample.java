package udemy.section8;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Adan");
        names.add("Nancy");

        for(String name : names) {
            System.out.println("Iterator 1: " + name);
        }

        for(String name : names) {
            System.out.println("Iterator 2: " + name);
        }

        System.out.println("----------------------------");

        Stream<String> stream = names.stream();
        stream.forEach(p -> System.out.println("<<<< :" + p));
//        stream.forEach(p -> System.out.println("<<<< :" + p));

        List<String> personNames = PersonRepository.getAllPersons()
                .stream().peek(p -> System.out.println(p))
                .map(Person::getName)
                .collect(Collectors.toList());
    }
}
