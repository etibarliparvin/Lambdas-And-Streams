package udemy.section5.function;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionPersonExample {
    public static void main(String[] args) {
        Function<List<Person>, Map<String, Double>> f2 = p -> {
            Map<String, Double> map = new HashMap<>();
            p.forEach(el -> map.put(el.getName(), el.getSalary()));
            return map;
        };

        List<Person> personList = PersonRepository.getAllPersons();
        Map<String, Double> map = f2.apply(personList);
        System.out.println(map);
        System.out.println(personList.stream().map(p -> p.getName() + " " + p.getSalary()).collect(Collectors.toList()));
    }
}
