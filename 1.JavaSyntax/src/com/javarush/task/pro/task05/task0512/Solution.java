package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        // x - first, y - second, z - third
        for (int x = 0; x < multiArray.length; x++) {
            for (int y = 0; y < multiArray[x].length; y++) {
                for (int z = 0; z < multiArray[x][y].length; z++) {
                    System.out.println(multiArray[x][y][z]);
                }
            }
        }
    }
}
