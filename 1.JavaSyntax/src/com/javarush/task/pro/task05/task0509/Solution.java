package com.javarush.task.pro.task05.task0509;

/* 
Таблица умножения
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        
        // x - for rows, y - for columns
        for (int x = 0; x < MULTIPLICATION_TABLE.length; x++ ) {
            for (int y = 0; y < MULTIPLICATION_TABLE[0].length; y++) {
                MULTIPLICATION_TABLE[x][y] = (x+1)*(y+1);
            }
        }
        
        for (int x = 0; x < MULTIPLICATION_TABLE.length; x++ ) {
            for (int y = 0; y < MULTIPLICATION_TABLE[0].length; y++) {
                System.out.print(MULTIPLICATION_TABLE[x][y] + " ");
            }
            System.out.println("");
        }
    }
}
