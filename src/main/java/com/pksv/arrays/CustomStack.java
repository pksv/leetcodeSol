package com.pksv;

import java.util.ArrayList;
import java.util.List;

//Design a Stack With Increment Operation
public class CustomStack {
    List<Integer> stack;
    int size;

    public CustomStack(int maxSize) {
        stack = new ArrayList<>(maxSize);
        size = maxSize;
    }

    public static void main(String[] args) {
//        [[3],[1],[2],[],[2],[3],[4],[5,100],[2,100],[],[],[],[]]
//        ["CustomStack","push","push","pop","push","push","push","increment","increment","pop","pop","pop","pop"]
        CustomStack customStack = new CustomStack(3);
        customStack.push(1);
        customStack.push(2);
        System.out.println(customStack.pop());
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5, 100);
        customStack.increment(2, 100);
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
    }

    public void push(int x) {
        if (stack.size() < size) {
            stack.add(x);
        }
    }

    public int pop() {
        if (stack.isEmpty()) return -1;
        return stack.removeLast();
    }

    public void increment(int k, int val) {
        for (int i = 0; i < Math.min(k, stack.size()); i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
