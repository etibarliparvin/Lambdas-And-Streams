package udemy.section5;

@FunctionalInterface
public interface TestInterface {

    public void add();
    default String dayHi() {
        return "Hi";
    }

    static boolean isTrue() {
        return true;
    }
}
