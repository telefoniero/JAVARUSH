package com.javarush.task.pro.task13.task1313;

public class StringsLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;

        // if list is empty (empty first link)
        if (first.next == null) {
            first.next = node;
        }

        // linking new node with the last existing one
        Node lastValuableNode = last.prev;
        if (lastValuableNode != null) {
            lastValuableNode.next = node;
            node.prev = lastValuableNode;
        }

        // always linking last with the new node
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
