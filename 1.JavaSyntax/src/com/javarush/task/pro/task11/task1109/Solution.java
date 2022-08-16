package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Nested obj1 = new Outer.Nested();
        Outer.Inner obj2 = new Outer().new Inner();
    }
}
