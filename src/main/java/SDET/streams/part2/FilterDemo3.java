package SDET.streams.part2;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class FilterDemo3 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "HP Laptop", 25000));
        list.add(new Product(2, "Dell Laptop", 30000));
        list.add(new Product(3, "Lenovo Laptop", 28000));
        list.add(new Product(4, "Sony Laptop", 23000));
        list.add(new Product(5, "Apple Laptop", 90000));

        list.stream().filter(p -> p.price > 25000).forEach(p -> System.out.println(p.price));
    }
}
