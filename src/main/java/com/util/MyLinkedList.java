package com.util;

import org.w3c.dom.Node;

public class MyLinkedList<T> {
    public ListNode<T> head;

    public MyLinkedList() {
        this.head = null;
    }

    public void print() {
        ListNode<T> current =  this.head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public void add(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        if(head == null) {
            head = newNode;
        } else {
            ListNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

}
