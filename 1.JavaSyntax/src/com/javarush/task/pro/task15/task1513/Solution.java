package com.javarush.task.pro.task15.task1513;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Зри в корень
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)){
            Path path = Path.of(scanner.nextLine());
            System.out.println(path.getRoot());
        }
    }
}

