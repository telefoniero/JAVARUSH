package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
        String hexNumber2 = "5f2";
        System.out.println("Шестнадцатеричное число " + hexNumber2 + " равно десятичному числу " + toDecimal(hexNumber2));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber <= 0) {
            return "";
        }
        String hexNumber = "";
        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber /= 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null) {
            return 0;
        }
        int decimalNumber = 0;
        for (int i = hexNumber.length() - 1; i >= 0 ; i--) {
            int index = hexNumber.length() - 1 - i;
            int hexSymbol = hexNumber.charAt(index);
            int value = HEX.indexOf(hexSymbol);
            decimalNumber += value * Math.pow(16, i);
        }
        return decimalNumber;
    }
}
