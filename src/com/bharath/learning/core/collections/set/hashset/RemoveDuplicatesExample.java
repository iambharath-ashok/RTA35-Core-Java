package com.bharath.learning.core.collections.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesExample {

    public static void main(String[] args) {

        List<String> userIds = new ArrayList<>();
        userIds.add("user123");
        userIds.add("user456");
        userIds.add("user678");
        userIds.add("user777");
        userIds.add("user123");
        userIds.add("user456");

        System.out.println("User Ids With Duplicates: " + userIds);

        Set<String> uniqueUserIds = new HashSet<>(userIds);

        System.out.println("Unique User Ids: " + uniqueUserIds);
    }
}
