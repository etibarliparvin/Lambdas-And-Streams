package udemy.section6;

import udemy.repo.Person;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample1 {

    static Function<String, String> f1 = n -> n.toUpperCase();
    static Function<String, String> f2 = String::toString;

    static Predicate<Person> p1 = p -> p.getHeight() >= 140;
    static Predicate<Person> p2 = MethodReferenceExample1::heightCheck;
    static BiPredicate<Person, Integer> p3 = MethodReferenceExample1::heightCheckWithParam;

    public static void main(String[] args) {
        System.out.println("Lambda Expression Result :" + f1.apply("java"));
        System.out.println("Method Reference Result :" + f2.apply("java"));
    }

    public static boolean heightCheck(Person person) {
        return person.getHeight() >= 140;
    }

    public static boolean heightCheckWithParam(Person person, Integer height) {
        return person.getHeight() >= height;
    }
}
