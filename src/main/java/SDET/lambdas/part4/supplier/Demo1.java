package SDET.lambdas.part4.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Demo1 {
    public static void main(String[] args) {
        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());

        Supplier<Integer> ss = () -> 5;
        System.out.println(ss.get());
    }
}
