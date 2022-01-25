package udemy.section8;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        Integer kids = PersonRepository.getAllPersons().stream().map(Person::getKids).reduce(0, (a, b) -> a + b);
        System.out.println(kids);
    }
}
