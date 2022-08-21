package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        ArrayList<Month> list = new ArrayList<>(Arrays.asList(Month.values()));
        Collections.rotate(list, 1);
        Month[] months = list.toArray(new Month[Month.values().length]);
        return Arrays.copyOfRange(months, 0, 3);
    }

    public static Month[] getSpringMonths() {
        return Arrays.copyOfRange(Month.values(), 2, 5);
    }

    public static Month[] getSummerMonths() {
        return Arrays.copyOfRange(Month.values(), 5, 8);
    }

    public static Month[] getAutumnMonths() {
        return Arrays.copyOfRange(Month.values(), 8, 11);
    }

}
