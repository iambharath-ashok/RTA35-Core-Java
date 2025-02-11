package com.bharath.learning.core.oops.inheritance;

public class Products {
    private String name;
    private double price;
    private String brand;

     void display() {
        System.out.println(
                "Products{" +
                        "name='" + name + '\'' +
                        ", price=" + price +
                        ", brand='" + brand + '\'' +
                        '}'
        );
    }
}

class Computer extends Products {

    @Override
    public void display() {
        System.out.println(
                "Computer{" +

                        '}'
        );
    }
}
