package SDET.streams.part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int id;
    char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}

public class Demo3 {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Smith", 101, 'A'));
        list1.add(new Student("John", 102, 'B'));
        list1.add(new Student("Kennedy", 103, 'C'));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Scott", 104, 'A'));
        list2.add(new Student("Mary", 105, 'B'));
        list2.add(new Student("Kitty", 106, 'C'));

        List<List<Student>> list3 = Arrays.asList(list1, list2);
        List<String> collect = list3.stream().flatMap(l -> l.stream().map(x -> x.name)).collect(Collectors.toList());
        List<String> collect2 = list3.stream().flatMap(l -> l.stream()).map(s -> s.name).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect2);
    }
}
