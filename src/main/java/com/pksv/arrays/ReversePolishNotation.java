package com.pksv;

import java.util.Stack;

//Evaluate Reverse Polish Notation
public class ReversePolishNotation {
    public static void main(String[] args) {
//        String[] tokens = {"2", "1", "+", "3", "*"};
//        String[] tokens = {"4", "13", "5", "/", "+"};
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(new ReversePolishNotation().evalRPN(tokens));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (var t : tokens) {
            if ("+/*-".contains(t)) {
                int n2 = stack.pop();
                int n1 = stack.pop();
                switch (t) {
                    case "+" -> stack.push(n1 + n2);
                    case "-" -> stack.push(n1 - n2);
                    case "*" -> stack.push(n1 * n2);
                    case "/" -> stack.push(n1 / n2);
                }
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
