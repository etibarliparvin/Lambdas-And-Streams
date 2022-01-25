package udemy.section5.function;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    public static void main(String[] args) {
        Predicate<Person> p1 = p -> p.getHeight() >= 140;
        Predicate<Person> p2 = p -> p.getGender().equals("Male");
        BiFunction<List<Person>, Predicate<Person>, Map<String, Double>> bf = (list, predicate) -> {
            Map<String, Double> map = new HashMap<>();
            list.forEach(p -> {
                if (p1.and(predicate).test(p))
                    map.put(p.getName(), p.getSalary());
            });
            return map;
        };
        List<Person> list = PersonRepository.getAllPersons();
        Map<String, Double> map = bf.apply(list, p2);
        System.out.println(map);
    }
}
