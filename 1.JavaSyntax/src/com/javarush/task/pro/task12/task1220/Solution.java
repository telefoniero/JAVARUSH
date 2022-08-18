package com.javarush.task.pro.task12.task1220;

import java.util.ArrayList;
import java.util.Objects;

/* 
Охотники за привидением: в погоне за типами
*/

public class Solution {

    public static void main(String[] args) {
        var elements = new ArrayList<>();
        elements.add("Привет");
        elements.add(10);
        elements.add(new Integer[15]);
        elements.add(new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (int i = 0, size = elements.size(); i < size; i++) {
            Object element = elements.get(i);
            if (element instanceof String) {
                String string = (String) element ;
                printString();
            } else if (element instanceof Integer) {
                Integer number = (Integer) element;
                printInteger();
            } else if (element instanceof Integer[]) {
                Integer[] numbers = (Integer[]) element;
                printIntegerArray();
            } else
                printUnknown();
        }
    }

    public static void printString() {
        System.out.println("Строка");
    }

    public static void printInteger() {
        System.out.println("Целое число");
    }

    public static void printIntegerArray() {
        System.out.println("Массив целых чисел");
    }

    public static void printUnknown() {
        System.out.println("Другой тип данных");
    }
}
