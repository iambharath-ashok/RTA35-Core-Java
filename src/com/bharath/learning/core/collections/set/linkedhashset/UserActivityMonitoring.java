package com.bharath.learning.core.collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserActivityMonitoring {

    public static void main(String[] args) {

        Set<String> userActivityLog = new LinkedHashSet<>();
        userActivityLog.add("Logged In");
        userActivityLog.add("Viewed Profile");
        userActivityLog.add("Viewed Dashboard");
        userActivityLog.add("Searched for Products");
        userActivityLog.add("Logged Out");
        userActivityLog.add("Logged In");

        System.out.println("User Activity Log: " + userActivityLog);


    }
}
