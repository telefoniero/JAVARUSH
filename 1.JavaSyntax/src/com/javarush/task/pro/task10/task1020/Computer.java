package com.javarush.task.pro.task10.task1020;

public class Computer {
    SystemUnit systemUnit;
    Monitor monitor;
    Keyboard keyboard;
    Mouse mouse;
    Computer() {
        this.systemUnit = new SystemUnit();
        this.monitor = new Monitor();
        this.keyboard = new Keyboard();
        this.mouse = new Mouse();
    }
}
