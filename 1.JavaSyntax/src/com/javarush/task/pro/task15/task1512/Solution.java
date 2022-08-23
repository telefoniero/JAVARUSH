package com.javarush.task.pro.task15.task1512;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/* 
Задом наперед
*/

public class Solution {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        byte[] result = outputStream.toByteArray();

        // reverse
        for (int i = 0; i < result.length / 2; i++) {
            byte tmp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = tmp;
        }
        // rewrite
        outputStream.reset();
        outputStream.write(result);
        System.out.println(outputStream.toString());
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}