package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int borderIndex;
        
        if (array.length % 2 == 0) {
            borderIndex = array.length / 2 - 1;
        } else {
            borderIndex = (array.length + 1) / 2 - 1;
        }
        
        Arrays.fill(array, 0, borderIndex + 1, valueStart);
        Arrays.fill(array, borderIndex + 1, array.length, valueEnd);
        
        System.out.println(Arrays.toString(array));
    }
}
