package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int arrLength = array.length;
        int borderIdx = array.length % 2 == 0 ? array.length / 2 : (array.length + 1) / 2;
        
        for (int row = 0; row < result.length; row++) {
            int start = row == 0 ? 0 : borderIdx;
            int end = row == 0 ? borderIdx : array.length;
            
            result[row] = Arrays.copyOfRange(array, start, end);
        }
        
        System.out.println(Arrays.deepToString(result));
    }
}
