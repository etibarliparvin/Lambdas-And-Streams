package udemy.section8;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleStreamExample {
    public static void main(String[] args) {
        Map<String, List<String>> personMap = PersonRepository
                .getAllPersons()
                .stream()
                .collect(Collectors.toMap(Person::getName, Person::getHobbies));
        System.out.println(personMap);

        Predicate<Person> p = x -> x.getHeight() >= 140;

        Map<String, List<String>> personMap2 = PersonRepository
                .getAllPersons()
                .stream()
                .filter(p)
                .collect(Collectors.toMap(Person::getName, Person::getHobbies));
        System.out.println(personMap2);

        List<String> hobbies = PersonRepository.getAllPersons().stream().flatMap(m -> m.getHobbies().stream()).distinct().collect(Collectors.toList());
        List<String> hobbies2 = PersonRepository.getAllPersons().stream().map(Person::getHobbies).flatMap(List::stream).collect(Collectors.toList());
        System.out.println(hobbies);
    }
}
