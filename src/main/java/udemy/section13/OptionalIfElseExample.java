package udemy.section13;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.Optional;

public class OptionalIfElseExample {
    public static void main(String[] args) {
        orElse();
        orElseGet();
    }

    public static void orElse() {
        Optional<Person> person = PersonRepository.getPersonOptional();
//        String name = person.isPresent() ? person.get().getName() : "Data Not Found";
        String name = person.map(Person::getName).orElse("Data not found");
        System.out.println("OrElse Person Name :" + name);
    }

    public static void orElseGet() {
        Optional<Person> person = PersonRepository.getPersonOptional();
        String name = person.map(Person::getName).orElseGet(() -> "Data not found");
        System.out.println("OrElse Person Name :" + name);
    }

    public static void orElseThrow() {
        Optional<Person> person = PersonRepository.getPersonOptional();
        String name = person.map(Person::getName).orElseThrow(() -> new RuntimeException("Name not found"));
        System.out.println("OrElse Person Name :" + name);
    }
}
