package udemy.section14;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodExample {
    public static void main(String[] args) {
        List<String> nameList = PersonRepository.getAllPersons()
                .stream().map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Before sort");
        nameList.forEach(System.out::println);

        Collections.sort(nameList);
        System.out.println("After sort");
        nameList.forEach(System.out::println);
    }
}
