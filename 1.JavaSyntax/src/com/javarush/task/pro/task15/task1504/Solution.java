package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try(
            Scanner srcConsole = new Scanner(System.in);
            Scanner destConsole = new Scanner(System.in);
            InputStream input = Files.newInputStream(Path.of(srcConsole.nextLine()));
            OutputStream output = Files.newOutputStream(Path.of(destConsole.nextLine()))
        ) {
            byte[] buffer = new byte[2];
            while (input.available() > 0) {
                int real = input.read(buffer);
                byte[] filledBuffer = input.readAllBytes();

                if (real != 1) {
                    byte tmp = filledBuffer[0];
                    filledBuffer[0] = filledBuffer[1];
                    filledBuffer[1] = tmp;
                }

                output.write(filledBuffer, 0, real);
                // removing first two written bytes in input
                input.skip(2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

