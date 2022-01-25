package SDET.lambdas.part2.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    int experience;

    public Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        // Ex1:
        Employee emp = new Employee("John", 5000, 1);
        Predicate<Employee> p = (e) -> (e.salary > 3000 && e.experience > 3);
        if (p.test(emp)) System.out.println(emp.name);

        // Ex2:
        ArrayList<Employee> al = new ArrayList<>(Arrays.asList(new Employee("John", 5000, 5),
                new Employee("David", 2000, 2),
                new Employee("Scott", 3000, 3),
                new Employee("Alan", 4000, 4)));

        for (Employee employee : al) {
            if (p.test(employee))
                System.out.println(employee.name);
        }
        System.out.println("--------------------------------------------");
        al.stream().filter(p).forEach(e -> System.out.println(e.name));
    }
}
