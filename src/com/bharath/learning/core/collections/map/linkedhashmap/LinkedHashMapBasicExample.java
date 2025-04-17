package com.bharath.learning.core.collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapBasicExample {


    public static void main(String[] args) {

        Map<String, Object> countryCodes = new LinkedHashMap<>();
        countryCodes.put("India", 91);
        countryCodes.put("USA", 1);
        countryCodes.put("UK", 44);
        countryCodes.put("Canada", 1);

        // Displaying the LinkedHashMap
        System.out.println("Country Codes:");
        System.out.println("--------------------------------");
        for (Map.Entry countryCodeEntry : countryCodes.entrySet()) {
            System.out.println(countryCodeEntry.getKey() + " => " + countryCodeEntry.getValue());
        }



    }
}
