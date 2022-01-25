package SDET.lambdas.part3.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
    String name;
    Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("David", 50000));
        list.add(new Employee("John", 30000));
        list.add(new Employee("Mary", 20000));

        Function<Employee, Double> fn = e -> {
            double salary = e.salary;
            if (salary >= 10000 && salary <= 20000)
                return salary * 0.1;
            else if (salary >= 20000 && salary <= 30000)
                return salary * 0.2;
            else if (salary >= 30000 && salary <= 50000)
                return salary * 0.3;
            else return salary * 0.4;
        };

        Function<Employee, Integer> f1 = e -> e.salary;
        Predicate<Integer> p1 = p -> p >= 10000 && p <= 20000;
        List<Integer> salary = list.stream().map(f1).filter(p1).collect(Collectors.toList());
        System.out.println(salary);
    }
}
