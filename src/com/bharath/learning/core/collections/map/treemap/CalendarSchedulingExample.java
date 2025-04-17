package com.bharath.learning.core.collections.map.treemap;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class CalendarSchedulingExample {

    public static void main(String[] args) {

        Map<LocalDate, String> schedule = new TreeMap<>();
        schedule.put(LocalDate.of(2025, 04, 18), "Meeting with team");
        schedule.put(LocalDate.of(2025, 04, 23), "Project deadline");
        schedule.put(LocalDate.of(2025, 04, 19), "Client call");
        schedule.put(LocalDate.of(2025, 04, 24), "Team lunch");
        schedule.put(LocalDate.of(2025, 04, 21), "Presentation preparation");

        // Displaying the schedule
        System.out.println("Calendar Schedule:");
        System.out.println("--------------------------------");
        for (Map.Entry<LocalDate, String> entry : schedule.entrySet()) {
            System.out.println("Date: " + entry.getKey() + ", Event: " + entry.getValue());
        }
    }
}
