package com.bharath.learning.core.collections.map.hashmap;

import java.util.*;

public class CustomerOrderDetailsWithHashMap {

    public static void main(String[] args) {
        Map<String, List<Order>> orderMap = new HashMap<>();


        List<Order> customer1Orders = new ArrayList<>();
        customer1Orders.add(new Order("order1", "customer1", "product1", 2));
        customer1Orders.add(new Order("order2", "customer1", "product2", 1));

        orderMap.put("customer1", customer1Orders);


        List<Order> customer2Orders = List.of(
                new Order("order3", "customer2", "product3", 5),
                new Order("order4", "customer2", "product4", 3)
        );

        orderMap.put("customer2", customer2Orders);

        orderMap.put("customer3", List.of(
                new Order("order5", "customer3", "product5", 4),
                new Order("order6", "customer3", "product6", 2)
        ));

        // Displaying the orders for each customer
        System.out.println("Customer Order Details:");
        System.out.println("--------------------------------");
        System.out.println("Customer 1 Orders:");
        for (Order order : orderMap.get("customer1")) {
            System.out.println(order);
        }

        // iterating through Map
        Set<String> customerNames = orderMap.keySet();
        Collection<List<Order>> ordersOfAllCustomers = orderMap.values();
        Set<Map.Entry<String, List<Order>>> entries = orderMap.entrySet();

        // Displaying all the customer orders
        System.out.println("\nAll Customer Orders:");
        System.out.println("--------------------------------");
        for (Map.Entry<String, List<Order>> entry : entries) {
            String customerName = entry.getKey();
            List<Order> orders = entry.getValue();
            System.out.println("Orders for " + customerName + ":");
            for (Order order : orders) {
                System.out.println(order);
            }
        }



    }
}


class Order {

    private String orderId;
    private String customerName;
    private String product;
    private int quantity;

    public Order(String orderId, String customerName, String product, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}