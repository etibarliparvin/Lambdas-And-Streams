package udemy.section11;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitionExample {

    static Predicate<Person> p1 = p -> p.getHeight() >= 140;

    public static void byHeight() {
        Map<Boolean, List<Person>> collect = PersonRepository.getAllPersons().stream()
                .collect(Collectors.partitioningBy(p1));
        System.out.println(collect);
    }

    public static void byHeight2() {
        Map<Boolean, Set<Person>> collect = PersonRepository.getAllPersons().stream()
                .collect(Collectors.partitioningBy(p1, Collectors.toSet()));
        System.out.println(collect);
    }

    public static void byHeight3() {
        Map<Boolean, Map<String, List<String>>> collect = PersonRepository.getAllPersons().stream()
                .collect(Collectors.partitioningBy(p1, Collectors.toMap(Person::getName, Person::getHobbies)));
        System.out.println(collect);
    }

    public static void main(String[] args) {
        byHeight();
        System.out.println("------------------");
        byHeight2();
        System.out.println("------------------");
        byHeight3();
    }
}
