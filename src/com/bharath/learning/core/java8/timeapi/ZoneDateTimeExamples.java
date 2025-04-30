package com.bharath.learning.core.java8.timeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExamples {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + zonedDateTime);

        ZonedDateTime californiaTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("California Time: " + californiaTime);
    }
}
