package udemy.section8;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCustomSortExample {
    public static void main(String[] args) {
        System.out.println("Sort by name");
        List<Person> name = PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
        System.out.println(name);

        System.out.println("Sort by height");
        List<Person> height = PersonRepository.getAllPersons().stream().sorted(Comparator.comparing(Person::getHeight)).collect(Collectors.toList());
        System.out.println(height);
    }
}
