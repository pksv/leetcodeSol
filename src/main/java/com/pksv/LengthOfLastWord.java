package com.pksv;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(new LengthOfLastWord().lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        String[] x = s.split(" ");
        return x[x.length - 1].length();
    }
}
