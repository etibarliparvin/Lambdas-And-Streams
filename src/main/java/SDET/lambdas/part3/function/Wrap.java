package SDET.lambdas.part3.function;

public class Wrap<T> {
    private final T value;

    public Wrap(T value) {
        this.value = value;
    }

    public static <T> Wrap<T> of(T value) {
        return new Wrap<>(value);
    }

    @Override
    public String toString() {
        return "Wrap{" +
                "value=" + value +
                '}';
    }
}
