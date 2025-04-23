package com.bharath.learning.core.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
interface SuperUserDetector{

    boolean isSuperUser(String user);

}


public class StreamWithLambda {

    public static void main(String[] args) {

        List<String> users = Arrays.asList("Admin", "User", "Guest", "SuperAdmin", "SuperUser");

        SuperUserDetector superUserDetector = (user) -> user.startsWith("Super");

        // Using the lambda expression to filter super users
        superUserDetector.isSuperUser("SuperAdmin");
        superUserDetector.isSuperUser("SuperBharath");
        superUserDetector.isSuperUser("SuperUser");
        superUserDetector.isSuperUser("Admin");

        Predicate<String> superUserPredicate = (user) -> user.contains("Super");
        superUserPredicate.test("SuperAdmin");

        Predicate<String> adminUserPredicate = (user) -> user.contains("Admin");




    }
}
