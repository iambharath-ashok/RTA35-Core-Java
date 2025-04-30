package com.bharath.learning.core.java8.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class CommonTimeApiClasses {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("LocalDate: " + localDate);
        System.out.println("LocalDateTime: " + localDateTime);
        System.out.println("LocalTime: " + localTime);
        System.out.println("ZonedDateTime: " + zonedDateTime);

        //-------------------------------------
        System.out.println("======================================================");

        localDate.minusYears(1);
        localDate.minusMonths(1);
        localDate.minusDays(1);


    }
}
