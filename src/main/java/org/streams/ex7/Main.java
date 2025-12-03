package org.streams.ex7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product pr1 = new Product(1, "Ceviche", 15.0);
        Product pr2 = new Product(2, "Chilaquiles", 25.50);
        Product pr3 = new Product(3, "Bandeja Paisa", 35.50);
        Product pr4 = new Product(4, "Ceviche", 15.0);

        List<Product> pr = Arrays.asList(pr1, pr2, pr3, pr4);

        Implementation imp = new Implementation();

        // Print grouped names
        System.out.println(imp.getProductName(pr));

        // Print sum per product
        System.out.println(imp.getSum(pr));
    }
}

