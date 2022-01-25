package udemy.section13;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.Optional;

public class OptionalMapExample {
    public static void main(String[] args) {
        optionalMapExample();
        optionalFlatMapExample();
    }

    public static void optionalMapExample() {
        Optional<Person> person = PersonRepository.getPersonOptional();
        person.ifPresent(person1 -> {
            String name = person.map(Person::getName).orElse("No data found");
            System.out.println("Name : " + name);
        });
    }

    public static void optionalFlatMapExample() {
        Optional<Person> person = PersonRepository.getPersonOptional();
        if(person.isPresent()) {
//            Optional<List<String>> strings = person.map(Person::getHobbies);
//            System.out.println(strings);
            Optional<List<String>> strings = person.flatMap(Person::getHobbies2);
            System.out.println(strings);
        }
    }

    public static void optionalMapFilterExample() {
        Optional<Person> person1 = PersonRepository.getPersonOptional().filter(person -> person.getHeight() > 140);
        person1.ifPresent(p -> System.out.println(p.getName()));
    }
}
