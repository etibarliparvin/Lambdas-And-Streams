package udemy.section6;

import java.util.Comparator;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Comparator<Integer> comp = MethodReferenceExample::compare;
        System.out.println();
    }

    public static int compare(Integer a, Integer b) {
        return Integer.compare(a, b);
    }
}
