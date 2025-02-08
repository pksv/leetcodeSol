package com.pksv.string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseString("Hello World"));
    }

    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
//            chars[i] ^= chars[j];
//            chars[j] ^= chars[i];
//            chars[i] ^= chars[j];
            chars[i] = (char) (chars[i] + chars[j] - (chars[j] = chars[i]));
            i++;
            j--;
        }
        return String.valueOf(chars);
    }
}