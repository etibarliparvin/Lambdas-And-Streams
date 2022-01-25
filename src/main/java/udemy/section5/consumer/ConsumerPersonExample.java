package udemy.section5.consumer;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPersonExample {
    public static void main(String[] args) {
        Consumer<Person> c1 = p -> System.out.println(p);
        Consumer<Person> c2 = p -> System.out.println(p.getName());
        Consumer<Person> c3 = p -> System.out.println(p.getHobbies());
        Predicate<Person> p1 = p -> p.getGender().equals("Male") && p.getHeight() >= 140;

        List<Person> list = PersonRepository.getAllPersons();
        list.stream().forEach(c1);
        System.out.println("---------------");
        list.stream().forEach(c2);
        System.out.println("---------------");
        list.stream().forEach(c3);
        System.out.println("---------------");
        list.stream().filter(p1).forEach(c1);
    }
}
