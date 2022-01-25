package udemy.section5.consumer;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class BiCosumerPersonExample {
    public static void main(String[] args) {
        printPersonDetails();
    }

    public static void printPersonDetails() {
        BiConsumer<String, List<String>> person = (name, hobbies) -> System.out.println(name + " " + hobbies);
        BiConsumer<String, Double> salary = (name, sal) -> System.out.println(name + " " + sal);

        List<Person> list = PersonRepository.getAllPersons();
        list.forEach(p -> person.accept(p.getName(), p.getHobbies()));
        list.forEach(p -> {
            person.accept(p.getName(), p.getHobbies());
            salary.accept(p.getName(), p.getSalary());
        });
    }
}
