package com.bharath.learning.core.collections.set.linkedhashset;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LRUCache {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lruCache = new LinkedHashMap<>(5, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > 5;
            }
        };


        lruCache.put(1, "google.com");
        lruCache.put(2, "insta.com");
        lruCache.put(3, "fb.com");
        lruCache.put(4, "amazon.com");
        lruCache.put(5, "astronout.com");

        System.out.println("Cache: " + lruCache);
        lruCache.put(6, "fruits.com");
        System.out.println("Cache: " + lruCache);

    }
}
