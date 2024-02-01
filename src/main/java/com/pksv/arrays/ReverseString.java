package com.pksv.arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        var x = s.clone();
        var size = s.length - 1;
        for (int i = 0; i < s.length; i++) {
            s[size--] = x[i];
        }
    }
}
