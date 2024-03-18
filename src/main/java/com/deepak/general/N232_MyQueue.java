package com.deepak.general;

import java.util.Stack;

public class N232_MyQueue {
    private Stack<Integer> stackOne;
    private Stack<Integer> stackTwo;

    public N232_MyQueue() {
        stackOne = new Stack<>();
        stackTwo = new Stack<>();
    }

    public void push(int x) {
        stackOne.push(x);
    }

    public int pop() {
        moveElements();
        return stackTwo.pop();
    }

    public int peek() {
        moveElements();
        return stackTwo.pop();
    }

    public boolean isEmpty() {
        return stackOne.isEmpty() && stackTwo.isEmpty();
    }

    private void moveElements() {
        if (stackTwo.isEmpty()) {
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
        }
    }


    public static void main(String[] args) {
        N232_MyQueue myQueue = new N232_MyQueue();
        myQueue.push(3);
        myQueue.push(1);
        myQueue.push(5);
        myQueue.push(6);
        myQueue.push(2);
        myQueue.push(8);
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.pop());
        }


    }
}
