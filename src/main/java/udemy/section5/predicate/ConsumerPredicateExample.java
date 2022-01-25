package udemy.section5.predicate;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicateExample {

    static Predicate<Person> p1 = p -> p.getHeight() >= 140;

    static Predicate<Person> p2 = p -> p.getGender().equals("Male");

    static BiPredicate<Integer, String> p3 = (height, gender) -> height >= 140 && gender.equals("Male");

    static BiConsumer<String, List<String>> consumer = (name, hobbies) -> System.out.println(name + " " + hobbies);

    static Consumer<Person> consumer2 = per -> {
        if (p1.and(p2).test(per)) consumer.accept(per.getName(), per.getHobbies());
    };

    static Consumer<Person> consumer3 = person -> {
        if (p3.test(person.getHeight(), person.getGender())) consumer.accept(person.getName(), person.getHobbies());
    };

    public static void main(String[] args) {
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(consumer2);
        personList.forEach(consumer3);
    }
}
