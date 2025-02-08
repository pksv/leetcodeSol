package com.pksv;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] operations = {"5", "2", "C", "D", "+"};
        System.out.println(new BaseballGame().calPoints(operations));
    }

    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (var o : operations) {
            switch (o) {
                case "D" -> {
                    stack.push(stack.peek() * 2);
                }
                case "C" -> {
                    stack.pop();
                }
                case "+" -> {
                    int last = stack.pop();
                    int secondL = stack.peek();
                    stack.push(last);
                    stack.push(last + secondL);
                }
                default -> stack.push(Integer.parseInt(o));
            }
        }

        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
