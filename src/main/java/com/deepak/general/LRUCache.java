package com.deepak.general;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> map;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.previous = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        removeNodeFromList(node);
        addNodeToList(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            removeNodeFromList(map.get(key));
        } else if (map.size() == capacity) {
            map.remove(head.next.key);
            removeNodeFromList(head.next);
        }
        Node node = new Node(key, value);
        addNodeToList(node);
        map.put(key, node);
    }

    private void removeNodeFromList(Node node) {
        Node previousNode = node.previous;
        Node nextNode  = node.next;
        previousNode.next = nextNode;
        nextNode.previous = previousNode;
    }

    private void addNodeToList(Node node) {
        Node previousNode = tail.previous;
        previousNode.next = node;
        node.previous = previousNode;
        node.next = tail;
        tail.previous = node;
    }

    private static class Node {
        int key, value;
        Node previous;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class DoubleLinkedList {
        private final Node head;
        private final Node tail;
        DoubleLinkedList() {
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.previous = head;
        }
    }
}
