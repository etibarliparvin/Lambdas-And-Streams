package udemy.section13;

import udemy.repo.Person;
import udemy.repo.PersonRepository;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        System.out.println("Result :" + myName("John"));
        Optional<String> name = Optional.ofNullable(myName("John"));
        System.out.println(name.orElse("Not provided"));

        System.out.println("Person Name :" + personName(new Person()));
        Optional<String> personName = personNameWithOptional(PersonRepository.getPersonOptional());
        System.out.println("The Optional Person Name is : " + personName.get());
    }

    public static String myName(String name) {
        return null;
    }

    public static String personName(Person person) {
        if (person != null)
            return person.getName();
        else return "No Data Found";
    }

    public static Optional<String> personNameWithOptional(Optional<Person> person) {
        if (null != person)
            return person.map(Person::getName);
        else return Optional.empty();
    }
}
