package com.pksv.stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
//        ["MinStack","push","push","push","getMin","pop","top","getMin"]
//        ["MinStack","push","push","push","getMin","pop","getMin"]
//        [[],[0],[1],[0],[],[],[]]
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
//        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.empty() || val <= minStack.peek()) minStack.push(val);
    }

    public void pop() {
        int val = stack.pop();
        if (minStack.peek() == val) minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
