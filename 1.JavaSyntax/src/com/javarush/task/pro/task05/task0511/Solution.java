package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // creating rows
        multiArray = new int[console.nextInt()][];
        
        // x - for rows, y - for element in row
        for (int x = 0; x < multiArray.length; x++) {
            multiArray[x] = new int[console.nextInt()];
        }
        
        for (int i = 0; i < multiArray.length; i++) {
           for (int j = 0; j < multiArray[i].length; j++)
              System.out.print( multiArray[i][j] + " " );
           System.out.println();
        }
    }
}
