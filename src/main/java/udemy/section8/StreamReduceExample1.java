package udemy.section8;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.Optional;

public class StreamReduceExample1 {
    public static void main(String[] args) {
        String names = PersonRepository.getAllPersons().stream().map(Person::getName).reduce("", (a, b) -> a.concat(b).concat(","));
        System.out.println(names);
        Optional<Person> tallestPerson = PersonRepository.getAllPersons().stream().reduce((a, b) -> a.getHeight() > b.getHeight() ? a : b);
        System.out.println(tallestPerson.get().getName());
    }
}
