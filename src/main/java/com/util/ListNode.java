package com.util;

public class ListNode<T> {
    public T val;
    public ListNode<T> next;

    public ListNode(T val) {
        this.val = val;
        this.next = null;
    }

     public ListNode(T val, ListNode<T> listNode) {
        this.val = val;
        this.next = listNode;
    }
}
