package org.example;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String input = "(){}";
        System.out.println(new ValidParentheses().isValid(input));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty() && matchingBracket(stack.peek(), c)) {
                stack.pop();
            } else return false;
        }
        return stack.isEmpty();
    }

    public boolean matchingBracket(char open, char close) {
        return ((open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}'));
    }
}
