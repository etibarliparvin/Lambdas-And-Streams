package SDET.lambdas.part4.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    String gender;

    public Employee(String name, int salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("David", 50000, "Male"));
        list.add(new Employee("John", 30000, "Male"));
        list.add(new Employee("Mary", 20000, "Female"));
        list.add(new Employee("Scott", 60000, "Male"));

        // Function
        Function<Employee, Integer> f = e -> (e.salary * 10) / 100;

        // Predicate
        Predicate<Integer> p = s -> s >= 5000;

        // Consumer
        Consumer<Employee> c = e -> {
            System.out.println(e.name);
            System.out.println(e.salary);
            System.out.println(e.gender);
        };

        for (Employee e : list) {
            if (p.test(f.apply(e))) {
                c.accept(e);
                System.out.println(f.apply(e));
            }
        }
    }
}
