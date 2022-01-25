package udemy.section11;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningExample {
    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        String join = Stream.of(ch).map(e -> new String(e)).collect(Collectors.joining());
        String join2 = Stream.of(ch).map(e -> new String(e)).collect(Collectors.joining("","[", "]"));
        System.out.println(join);
        System.out.println(join2);

        String names = PersonRepository.getAllPersons().stream().map(Person::getName).collect(Collectors.joining(","));
        System.out.println(names);
        long kids = PersonRepository.getAllPersons().stream().map(Person::getKids).reduce(0, (a, b) -> a + b).longValue();
        System.out.println(PersonRepository.getAllPersons().stream().collect(Collectors.summingInt(Person::getKids)));
        System.out.println(kids);
        Long count = PersonRepository.getAllPersons().stream().collect(Collectors.counting());
        System.out.println(count);

        int height1 = PersonRepository.getAllPersons().stream().map(Person::getHeight).reduce(0, Integer::sum);
        double height2 = PersonRepository.getAllPersons().stream().collect(Collectors.averagingDouble(Person::getHeight));
        System.out.println(height1);
        System.out.println(height2);
    }
}
