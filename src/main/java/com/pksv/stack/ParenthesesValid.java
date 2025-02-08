package com.pksv.stack;

//Minimum Add to Make Parentheses Valid
public class ParenthesesValid {
    public static void main(String[] args) {
//        String s = "())";
        String s = "())(";
        System.out.println(new ParenthesesValid().minAddToMakeValid(s));
    }

    public int minAddToMakeValid(String s) {
        int o = 0;
        int c = 0;
        for (var ch : s.toCharArray()) {
            if (ch == '(') o++;
            else if (o > 0) o--;
            else c++;
        }
        return o + c;
    }
}
