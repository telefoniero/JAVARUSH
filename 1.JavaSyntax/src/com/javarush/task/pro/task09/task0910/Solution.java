package com.javarush.task.pro.task09.task0910;

/* 
Кодировка Unicode
*/

public class Solution {
    public static final char[] mySymbols = new char[]{'\u00A9', '\u004A', '\u0061', '\u0076', '\u0061', '\u0052', '\u0075', '\u0073', '\u0068'};

    public static void main(String[] args) {
        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));
    }

    public static void init(char[] symbols) {
        for (int i = 0, max = symbols.length; i < max; i++) {
            symbols[i] = mySymbols[i];
        }
    }
}
