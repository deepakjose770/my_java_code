package com.deepak.general;

import com.deepak.util.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Linked_List_160 {
    public static void main(String[] args) {
        ListNode<Integer> commonNode = new ListNode<>(8);
        commonNode.next = new ListNode<>(4);

        ListNode<Integer> headOne = new ListNode<>(4);
        headOne.next = new ListNode<>(1);
        headOne.next.next = commonNode;

        ListNode<Integer> headTwo = new ListNode<>(6);
        headTwo.next = new ListNode<>(1);
        headTwo.next.next = commonNode;
        System.out.println("The intersection is "+ getIntersectionNode(headOne, headTwo).val);
    }


    public static ListNode<Integer> getIntersectionNode(ListNode<Integer> headA, ListNode<Integer> headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        return pointerA;
    }
}
