package udemy.section5.predicate;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePersonExample {

    static Predicate<Person> p1 = p -> p.getHeight() >= 140;
    static Predicate<Person> p2 = p -> p.getGender().equals("Male");

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        List<Person> collect = personList.stream().filter(p1.and(p2)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
