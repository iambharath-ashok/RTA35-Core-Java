package com.bharath.learning.core.java8.timeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class VehicleInsuranceExample {

    public static void main(String[] args) {
        LocalDate registrationDate = LocalDate.of(2023, 1, 1);
        LocalDate renewalDate = registrationDate.plusYears(3);

        LocalDate today = LocalDate.now();

        Period period = Period.between(today, renewalDate);
        System.out.println("Time left for renewal: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");

        long daysLeft = ChronoUnit.DAYS.between(today, renewalDate);
        long monthsLeft = ChronoUnit.MONTHS.between(today, renewalDate);
       // long minutesLeft = ChronoUnit.MINUTES.between(today, renewalDate);
        System.out.println("Days left for renewal: " + daysLeft);
        System.out.println("Months left for renewal: " + monthsLeft);
       // System.out.println("Minutes left for renewal: " + minutesLeft);
    }
}
