package com.pksv;

//Separate Black and White Balls
public class SeparateBalls {
    public static void main(String[] args) {
        String s = "11111111111110101";
        System.out.println(new SeparateBalls().minimumSteps(s));
    }

    public long minimumSteps(String s) {
        int count = 0;
        long solution = 0;
        for (int i = s.length(); i > 0; i--) {
            if (s.charAt(i - 1) == '0') {
                count++;
                solution += (i - count);
            }
        }

        return solution;
    }
}
