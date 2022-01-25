package SDET.streams.part7;

import java.util.Arrays;
import java.util.List;

class Student {
    public String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}

public class ParallelStreamsDemo {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("David", 82),
                new Student("Rob", 90),
                new Student("John", 65),
                new Student("Kennedy", 55),
                new Student("Eric", 85),
                new Student("Smith", 88),
                new Student("Scott", 50)
        );

        // using stream() - sequential
        studentList.stream().filter(s -> s.score > 80).limit(3).forEach(System.out::println);

        // parallel stream()
        studentList.parallelStream().filter(s -> s.score > 80).limit(3).forEach(System.out::println);
    }
}
