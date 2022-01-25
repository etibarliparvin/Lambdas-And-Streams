package SDET.lambdas.part1;

public class Main {
    public static void main(String[] args) {
        Cab cab = () -> System.out.println("Ola cab is booked...");
        cab.bookCab();

        Cab2 cab2 = (a, b) -> System.out.println(a + " " + b);
        cab2.bookCab("one", "two");

        Cab3 cab3 = (a, b) -> {
            System.out.println(a + " " + b);
            return "5000 Rs";
        };
        System.out.println(cab3.book("one", "two"));
    }
}
