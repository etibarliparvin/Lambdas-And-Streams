package udemy.section14;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.Comparator;
import java.util.List;

public class DefaultCustomSortExample {

    static Comparator<Person> c1 = Comparator.comparing(Person::getName);
    static Comparator<Person> c2 = Comparator.comparing(Person::getHeight);

    public static void main(String[] args) {
        List<Person> listOfPerson = PersonRepository.getAllPersons();
        sortByName(listOfPerson);
        System.out.println("-------------------------------------------------------------------------------------------");
        sortByHeight(listOfPerson);
        System.out.println("-------------------------------------------------------------------------------------------");
        sortByNameAndHeight(listOfPerson);
        System.out.println("--------------------------------------------------------------------------------------------");
        sortByNameWithNullFirst(listOfPerson);
        System.out.println("--------------------------------------------------------------------------------------------");
        sortByNameWithNullLast(listOfPerson);
    }

    public static void sortByName(List<Person> list) {
        list.sort(c1);
        list.forEach(System.out::println);
    }

    public static void sortByHeight(List<Person> list) {
        list.sort(c2);
        list.forEach(System.out::println);
    }
    
    public static void sortByNameAndHeight(List<Person> list) {
        list.sort(c1.thenComparing(c2));
        list.forEach(System.out::println);
    }

    public static void sortByNameWithNullFirst(List<Person> list) {
        Comparator<Person> nullComp = Comparator.nullsFirst(c1);
        list.sort(nullComp);
        list.forEach(System.out::println);
    }

    public static void sortByNameWithNullLast(List<Person> list) {
        Comparator<Person> nullComp = Comparator.nullsLast(c1);
        list.sort(nullComp);
        list.forEach(System.out::println);
    }
}
