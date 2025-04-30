package com.bharath.learning.core.java8.timeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExamples {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(1999, 10, 1);

        LocalDate today = LocalDate.now();

        Period period = Period.between(localDate, today);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

    }
}
