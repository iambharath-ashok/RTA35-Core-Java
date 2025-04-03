package com.bharath.learning.core.collections.comparatorsandcomparables;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

public class MainWithProductComparator {

    public static void main(String[] args) {


        Product product1 = new Product("Laptop", 1200.00, 5, LocalDate.of(2023, 10, 1), 10);
        Product product2 = new Product("Smartphone", 800.00, 4, LocalDate.of(2023, 9, 15), 20);
        Product product3 = new Product("Tablet", 600.00, 3, LocalDate.of(2025, 1, 20), 15);
        Product product4 = new Product("Smartwatch", 200.00, 4, LocalDate.of(2023, 7, 10), 30);
        Product product5 = new Product("Headphones", 150.00, 5, LocalDate.of(2024, 6, 5), 25);
        Product product6 = new Product("Smart TV", 1000.00, 4, LocalDate.of(2024, 8, 25), 5);


        Comparator<Product> productQuantityComparator = Comparator.comparing(Product::getQuantity).reversed();
        Comparator<Product> productPriceComparator = Comparator.comparing(Product::getPrice);
        Comparator<Product> productComparator = Comparator.comparing(Product::getRatings)
                .thenComparing(Product::getName)
                .thenComparing(Product::getDateArrived)
                .thenComparing(Product::getPrice);

//        TreeSet<Product> products = new TreeSet<>(new ProductPriceComparator());
        TreeSet<Product> products = new TreeSet<>(productComparator);




        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);

        System.out.println("TreeSet of Products: " + products);

        System.out.println("Sorted by Price:");
        products.stream().sorted(productPriceComparator).forEach(System.out::println);
        System.out.println("Sorted by Quantity:");
        products.stream().sorted(productQuantityComparator).forEach(System.out::println);
        System.out.println("Sorted by Ratings, Name, Date Arrived and Price:");
        products.stream().sorted(productComparator).forEach(System.out::println);
        System.out.println("Sorted by Date Arrived:");
        products.stream().sorted(new ProductDateArrivedComparator()).forEach(System.out::println);



    }
}
