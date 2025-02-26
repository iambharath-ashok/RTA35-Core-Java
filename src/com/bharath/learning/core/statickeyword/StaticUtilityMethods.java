package com.bharath.learning.core.statickeyword;


import java.time.LocalDateTime;
import java.time.ZonedDateTime;

// Static Methods will be mainly used for creating Utility methods
// Utility methods are methods that are not related to any object but are related to the class
// Utility methods are used to perform common tasks that are not related to any object
// Utility methods can be directly accessible from the class name
class MathHelper {

    public static int square(int number) {
        return number * number;
    }

    public static int cube(int number) {
        return number * number * number;
    }
}

class DateHelper {

    public static String getDayOfWeek(int day) {
        switch (day) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid Day";
        }
    }

    public static String getMonth(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid Month";
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static LocalDateTime convertFromOneTimeZoneToAnother(LocalDateTime dateTime, String fromTimeZone, String toTimeZone) {
        return null;
    }
}


public class StaticUtilityMethods {


    public static void main(String[] args) {
        // Utility methods can be directly accessible from the class name
        // Static methods are accessed using class name
        System.out.println(MathHelper.square(5));
        System.out.println(MathHelper.cube(5));

        System.out.println(DateHelper.getDayOfWeek(1));
        System.out.println(DateHelper.getMonth(1));
        System.out.println(DateHelper.isLeapYear(2020));
    }
}
