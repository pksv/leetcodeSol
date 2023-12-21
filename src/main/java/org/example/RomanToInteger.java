package org.example;

public class RomanToInteger {
    public static void main(String[] args) {
        String input = "MCMXCIV";
        System.out.println(new RomanToInteger().romanToInt(input));
    }

    public int romanToInt(String s) {
        int result = 0;
        if (s.equals("I")) {
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    result -= 1;
                    continue;
                }
                if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    result -= 10;
                    continue;
                }
                if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    result -= 100;
                    continue;
                }
            }

            if (s.charAt(i) == 'I') {
                result += 1;
                continue;
            }
            if (s.charAt(i) == 'X') {
                result += 10;
                continue;
            }

            if (s.charAt(i) == 'C') {
                result += 100;
                continue;
            }
            if (s.charAt(i) == 'V') {
                result += 5;
                continue;
            }
            if (s.charAt(i) == 'L') {
                result += 50;
                continue;
            }
            if (s.charAt(i) == 'D') {
                result += 500;
                continue;
            }
            if (s.charAt(i) == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}
