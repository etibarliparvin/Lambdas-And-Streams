package udemy.section8;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMaxByExample {
    public static void main(String[] args) {
        Optional<Person> tallest = PersonRepository.getAllPersons().stream().collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));
        Optional<Person> shortest = PersonRepository.getAllPersons().stream().collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));

    }
}
