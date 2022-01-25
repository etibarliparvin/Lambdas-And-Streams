package udemy.section12;

import java.util.function.Supplier;
import java.util.stream.LongStream;

public class SequentialParallelExample1 {
    public static void main(String[] args) {
//        System.out.println("Sum from Sequential :" + sum1());
//        System.out.println("Sum from Parallel :" + sum2());
        System.out.println("Sum from seq :" + checkPerformance(SequentialParallelExample1::sum1, 50));
        System.out.println("Sum from par :" + checkPerformance(SequentialParallelExample1::sum2, 50));
    }

    static long checkPerformance(Supplier<Long> sum, int times) {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            sum.get();
        }
        return end - start;
    }

    public static long sum1() {
        return LongStream.rangeClosed(0, 1000000).sum();
    }

    public static long sum2() {
        return LongStream.rangeClosed(0, 1000000).parallel().sum();
    }
}
