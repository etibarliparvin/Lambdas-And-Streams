package udemy.section12;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamUseCase {
    public static void main(String[] args) {
        System.out.println(getHobbiesBySeq());
        System.out.println(getHobbiesByParallel());
    }

    public static List<String> getHobbiesBySeq() {
        long start = System.currentTimeMillis();
        List<String> hobbies = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Sequential duration :" + (end - start));
        return hobbies;
    }

    public static List<String> getHobbiesByParallel() {
        long start = System.currentTimeMillis();
        List<String> hobbies = PersonRepository.getAllPersons()
                .parallelStream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Sequential duration :" + (end - start));
        return hobbies;
    }
}
