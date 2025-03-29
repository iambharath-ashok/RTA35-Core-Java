package com.bharath.learning.core.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailsExamples {

    public static void main(String[] args) {
        Set<String> uniqueEmails = new HashSet<>();;
        uniqueEmails.add("user@example.com");
        uniqueEmails.add("anotheruser@example.com");
        uniqueEmails.add("user@example.com");
        uniqueEmails.add("thirduser@gmail.com");

        System.out.println("Unique emails: " + uniqueEmails);



    }
}
