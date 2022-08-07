package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        
        // x - index of row, y - index of element in row
        for (int x = 0; x < result.length; x++) {
            result[x] = new int[x + 1];
            for (int y = 0; y < result[x].length; y++) {
                result[x][y] = x + y;
            }
        }
        
        for (int x = 0; x < result.length; x++) {
            for (int y = 0; y < result[x].length; y++) {
                System.out.print(result[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
