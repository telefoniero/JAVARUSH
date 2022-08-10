package com.javarush.task.pro.task08.task0817;

/* 
Инкременты
*/

public class Solution {

    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);
        // 1. (2 * 2) -> a = 3
        // 2. 3 + (2 * 2) = 7

        System.out.println(b);
    }
}