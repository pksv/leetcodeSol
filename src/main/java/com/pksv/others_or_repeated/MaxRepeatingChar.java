package com.pksv;

public class MaxRepeatingChar {
    public static void main(String[] args) {
        String str = "aaaabbcccbcc";
        System.out.println(new MaxRepeatingChar().maxRepeatingChar(str));
    }

    public char maxRepeatingChar(String str) {
        char x = str.charAt(0);
        int count = 1, max = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    x = str.charAt(i - 1);
                }
                count = 1;
            }
        }
        if (count > max) {
            return str.charAt(str.length() - 1);
        }

        return x;
    }
}
