package com.pksv.arrays;

public class DecodeWays {
    public static void main(String[] args) {
        System.out.println(new DecodeWays().numDecodings("122122121"));
    }

    public int numDecodings(String s) {
        char[] c = s.toCharArray();
        if (c[0] == '0') return 0;
        int prev = 0;
        int curr = 1;
        for (int i = 1; i < c.length; i++) {
            int currC = c[i] - '0';
            int prevC = c[i - 1] - '0';
            if (currC == 0 && !(prevC == 1 || prevC == 2)) {
                return 0;
            }
            int number = prevC * 10 + currC;
            int temp = 0;

            if (number >= 10 && number <= 26) {
                if (i >= 2) {
                    temp += prev;
                } else {
                    temp = 1;
                }
            }
            if (number != 10 && number != 20) {
                temp += curr;
            }
            prev = curr;
            curr = temp;
        }
        return curr;
    }

    public int numDecodings1(String s) {
        char[] c = s.toCharArray();
        if (c[0] == '0') return 0;
        int sz = c.length;
        int[] noWaysAtI = new int[sz];
        noWaysAtI[0] = 1;
        for (int i = 1; i < sz; i++) {
            System.out.println("i = " + i);
            int currC = c[i] - '0';
            int prevC = c[i - 1] - '0';
            if (currC == 0 && !(prevC == 1 || prevC == 2)) {
                return 0;
            }
            int number = prevC * 10 + currC;
            if (number >= 10 && number <= 26) {
                if (i >= 2) {
                    noWaysAtI[i] += noWaysAtI[i - 2];
                } else {
                    noWaysAtI[i] = 1;
                }
            }
            if (number != 10 && number != 20) {
                noWaysAtI[i] += noWaysAtI[i - 1];
            }
            System.out.println("noWaysAtI[i] = " + noWaysAtI[i]);
            System.out.println("noWaysAtI[i - 1] = " + noWaysAtI[i - 1]);
            if (i >= 2) {
                System.out.println("noWaysAtI[i - 2] = " + noWaysAtI[i - 2]);
            }
            System.out.println();
        }
        return noWaysAtI[sz - 1];
    }
}
