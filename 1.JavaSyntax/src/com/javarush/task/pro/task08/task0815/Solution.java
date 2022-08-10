package com.javarush.task.pro.task08.task0815;

/* 
Логические операторы
*/

public class Solution {

    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean firstCondition = number < 15 & number > 25 & (number += 15) < 25;
        // 0b00011110 | 0b00000101 = 0b00011111 = 31
        boolean secondCondition = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
