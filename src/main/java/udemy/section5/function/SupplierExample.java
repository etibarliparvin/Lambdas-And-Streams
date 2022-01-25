package udemy.section5.function;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Person> s = () -> PersonRepository.getPerson();
        Supplier<List<Person>> s2 = () -> PersonRepository.getAllPersons();
        System.out.println(s.get());
        System.out.println(s2.get());
    }
}
