package com.pksv;

public class LongestHappyString {
    public static void main(String[] args) {
//        int a = 1, b = 1, c = 7;
        int a = 7, b = 1, c = 0;
        System.out.println(new LongestHappyString().longestDiverseString(a, b, c));
    }

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder builder = new StringBuilder();
        int aCount = 0, bCount = 0, cCount = 0;
        int total = a + b + c;
        for (int i = 0; i < total; i++) {
            int max = Math.max(a, Math.max(b, c));
            if ((max == a && aCount != 2) || (a > 0 && (cCount == 2 || bCount == 2))) {
                builder.append('a');
                a--;
                aCount++;
                bCount = 0;
                cCount = 0;
            } else if ((max == b && bCount != 2) || (b > 0 && (cCount == 2 || aCount == 2))) {
                b--;
                builder.append('b');
                bCount++;
                aCount = 0;
                cCount = 0;
            } else if ((max == c && cCount != 2) || (c > 0 && (aCount == 2 || bCount == 2))) {
                c--;
                builder.append('c');
                cCount++;
                aCount = 0;
                bCount = 0;
            }
        }
        return builder.toString();
    }
}
