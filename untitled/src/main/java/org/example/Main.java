package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        List<Product> products = new ArrayList<>();

        Product p1 = new Product("rice", 10.23);
        Product p2 = new Product("grapes", 15.23);
        Product p3 = new Product("strawberry", 16.99);

        products.add(p1);
        products.add(p2);
        products.add(p3);

        Collections.sort(products);

        for (Product product : products){
            System.out.println(product);
        }
    }
}
