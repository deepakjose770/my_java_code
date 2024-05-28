package com.deepak.util;

import java.util.ArrayList;

public class DpkStack<T> {
    private ArrayList<T> arrayList;
    int top = -1;
    int size;

    public DpkStack(int size) {
        this.size = size;
        this.arrayList = new ArrayList<T>(size);
    }

    public void push( T t) {
        if(top + 1 == size) {
            System.out.println("Stack overflow");
        } else {
            top = top + 1;
            if(arrayList.size() > top) {
                arrayList.set(top, t);
            } else {
                arrayList.add(t);
            }
        }

    }

    public T peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            return arrayList.get(top);
        }
    }


    public T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            T element = arrayList.get(top);
            top--;
            return element;
        }
    }

    public boolean isEmpty() { return top == -1; }

    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < top; i++) {
            result.append(String.valueOf(arrayList.get(i))).append("->");
        }
        result.append(String.valueOf(arrayList.get(top)));
        return result.toString();
    }
}
