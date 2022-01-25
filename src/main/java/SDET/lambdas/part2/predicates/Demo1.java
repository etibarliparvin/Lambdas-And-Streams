package SDET.lambdas.part2.predicates;

import java.util.function.Predicate;

// Predicate -> always takes one parameter and returns boolean
// use only if you have conditional checks in your program

public class Demo1 {
    public static void main(String[] args) {
        // Ex1
        Predicate<Integer> p = (i) -> i > 10;
        System.out.println(p.test(10));

        // Ex2: check the length of given string is greate than 4 or not
        Predicate<String> p1 = (s) -> s.length() > 4;
        System.out.println(p1.test("Salam"));

        // Ex3: print array elements whose size is > 4 from array
        String[] names = {"David", "Scott", "Smith", "John", "Mary"};
        Predicate<String> p2 = (s) -> s.length() > 4;
        for (String name : names) {
            if(p2.test(name))
                System.out.println(name);
        }
    }
}
