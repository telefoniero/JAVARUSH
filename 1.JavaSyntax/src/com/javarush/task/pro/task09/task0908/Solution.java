package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    public static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null) {
            return "";
        }
        if (!binaryNumber.matches("[0,1]*")) {
            return "";
        }


        int remainder = binaryNumber.length() % 4;
        if (remainder != 0) {
            for (int i = 0; i < 4 - remainder; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }

        String hexNumber = "";
        for (int i = 1, max = binaryNumber.length(); i <= max; i++) {
            if ((i % 4) == 0) {
                String binarySet = binaryNumber.substring(i - 4, i);
                hexNumber += binarySetToHex(binarySet);
            }
        }

        return hexNumber;
    }
    public static String toBinary(String hexNumber) {
        if (hexNumber == null) {
            return "";
        }
        if (!hexNumber.matches("[0-9a-f]*")) {
            return "";
        }
        String binaryNumber = "";
        for (int i = 0, max = hexNumber.length(); i < max; i++) {
            char digit = hexNumber.charAt(i);
            binaryNumber += hexDigitToBinary(digit);
        }
        return binaryNumber;
    }

    public static String hexDigitToBinary(char hexDigit) {
        String binaryNumber = "";
        byte decimal = (byte) HEX.indexOf(hexDigit);

        while (decimal != 0) {
            binaryNumber = decimal % 2 + binaryNumber;
            decimal /= 2;
        }
        while (binaryNumber.length() != 4) {
            binaryNumber = "0" + binaryNumber;
        }
        return binaryNumber;
    }

    public static String binarySetToHex(String binarySet) {
        if (binarySet.length() > 4) {
            return null;
        }
        int decimal = 0;
        for (int i = binarySet.length() - 1; i >= 0; i--) {
            int index = binarySet.length() - 1 - i;
            int value = Character.getNumericValue(binarySet.charAt(index));
            decimal += value * Math.pow(2, i);
        }
        return Character.toString(HEX.charAt(decimal));
    }
}
