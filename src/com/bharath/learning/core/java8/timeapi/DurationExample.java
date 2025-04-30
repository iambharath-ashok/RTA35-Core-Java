package com.bharath.learning.core.java8.timeapi;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {

        LocalTime startTime = LocalTime.of(00, 00, 30);

        LocalTime now = LocalTime.now();

        Duration d = Duration.between(startTime, now);
        System.out.println("Duration in seconds: " + d.getSeconds());
        System.out.println("Duration in minutes: " + d.toMinutes());
        System.out.println("Duration in hours: " + d.toHours());

        System.out.println(startTime.isAfter(now));
    }
}
