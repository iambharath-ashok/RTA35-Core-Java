package com.bharath.learning.core.collections.comparatorsandcomparables;

import java.time.LocalDate;
import java.util.Comparator;

public class ProductDateArrivedComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getDateArrived().compareTo(o2.getDateArrived());
    }
}
