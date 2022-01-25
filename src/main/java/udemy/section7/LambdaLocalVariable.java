package udemy.section7;

import java.util.function.Consumer;

public class LambdaLocalVariable {
    static int k = 0;
    public static void main(String[] args) {
        int i = 0;
        Consumer<Integer> c1 = (a) -> {
            k++;
            System.out.println(k + i);
        };
        c1.accept(15);
    }
}
