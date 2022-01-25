package udemy.section12;

import java.util.stream.IntStream;

public class ParallelWhenNotToUseExample1 {
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        IntStream.rangeClosed(0, 2000).forEach(cal::calculate);
        System.out.println("Result in Seq :" + cal.getTotal());

        IntStream.rangeClosed(0, 2000).parallel().forEach(cal::calculate);
        System.out.println("Result in Par :" + cal.getTotal());
    }
}

class Calculate {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void calculate(int in) {
        total += in;
    }
}
