package com.pksv.string;

public class StringToInteger {
    public static void main(String[] args) {
//        String s = "1337c0d3";
        String s = "20000000000000000000";
        System.out.println(new StringToInteger().myAtoi(s));
    }

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int i = 0;
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            isNegative = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        int result = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int d = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && d > 7))
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            result = (result * 10) + d;
            i++;
        }
        return isNegative ? -result : result;
    }
}
