package com.javarush.task.pro.task13.task1314;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        // in case of empty list
        if (first.next == null) {
            return null;
        }

        Node iteratee = first;
        for (int i = 0; i <= index ; i++) {
            iteratee = iteratee.next;
            if (iteratee == null) {
                break;
            }
        }

        return iteratee != null ? iteratee.value : null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
