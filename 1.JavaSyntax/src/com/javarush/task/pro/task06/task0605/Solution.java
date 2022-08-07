package com.javarush.task.pro.task06.task0605;

/* 
Правильный порядок
*/

public class Solution {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int border = array.length % 2 == 0 ? array.length / 2 : (array.length - 1) / 2;
        for (int i = 0; i < border; i++) {
            int tmp = array[i];
            int reverseIndex = array.length - 1 - i;
            
            array[i] = array[reverseIndex];
            array[reverseIndex] = tmp;
        }
    
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
