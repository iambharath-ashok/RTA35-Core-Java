package com.bharath.learning.core.collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.8f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }

    public void displayCache() {
        System.out.println("Cache contents:");
        for (Map.Entry<K, V> entry : entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}


class Main {

    public static void main(String[] args) {

        LRUCache<String, String> lruCache = new LRUCache<>(5);
        lruCache.put("phone", "samsung fold");
        lruCache.put("tablet", "apple tab");
        lruCache.put("laptop", "Macbook pro");
        lruCache.put("desktop",    "Lenovo");
        lruCache.put("watch", "apple watch");


        System.out.println("Cache after adding 5 items:");
        lruCache.displayCache();

        System.out.println("--------------------------------------------");
        lruCache.put("camera", "Nikon");

        System.out.println("Cache after adding 6th item (should evict the oldest):");
        lruCache.displayCache();

        System.out.println("--------------------------------------------");
        lruCache.get("tablet");

        System.out.println("Cache after accessing 'tablet':");
        lruCache.displayCache();

        System.out.println("--------------------------------------------");
        lruCache.put("phone", "samsung fold 2");

        System.out.println("Cache after updating 'phone':");
        lruCache.displayCache();

    }
}
