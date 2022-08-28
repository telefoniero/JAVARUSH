package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;

/* 
Освоение нового API
*/

public class Solution {

    private static LocalDate currentDate = LocalDate.of(2020, 9, 12);

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        return LocalDate.ofYearDay(currentDate.getYear(), currentDate.getDayOfYear());
    }

    static LocalDate ofEpochDayExample() {
        return LocalDate.ofEpochDay(currentDate.toEpochDay());
    }
}
