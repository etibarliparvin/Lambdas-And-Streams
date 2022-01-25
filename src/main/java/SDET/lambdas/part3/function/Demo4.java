package SDET.lambdas.part3.function;

import java.util.function.Function;

public class Demo4 {
    public static void main(String[] args) {
        Function<Integer, String> itos = i -> "'" + i + "'";
        Function<String, Wrap<String>> stow = s -> Wrap.of(s);

        Function<Integer, Wrap<String>> itow = itos.andThen(stow);
        Function<Integer, Wrap<String>> itow2 = stow.compose(itos);

        System.out.println(itow.apply(3));
        System.out.println(itow2.apply(3));
    }
}
