package com.bharath.learning.core.collections.comparatorsandcomparables;

import java.time.LocalDate;
import java.util.Comparator;

public class Product  {

    private String name;
    private double price;
    private int ratings;
    private LocalDate dateArrived;
    private int quantity;

    public Product(String name, double price, int ratings, LocalDate dateArrived, int quantity) {
        this.name = name;
        this.price = price;
        this.ratings = ratings;
        this.dateArrived = dateArrived;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ratings=" + ratings +
                ", dateArrived=" + dateArrived +
                ", quantity=" + quantity +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public LocalDate getDateArrived() {
        return dateArrived;
    }

    public void setDateArrived(LocalDate dateArrived) {
        this.dateArrived = dateArrived;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
