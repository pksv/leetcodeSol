package com.pksv.string;

public class MinimumStringLength {
    public static void main(String[] args) {
        String s = "ABFCACDB";
//        String s = "ACBBD";
        System.out.println(new MinimumStringLength().minLength(s));
    }

    public int minLength(String s) {
        char[] c = new char[s.length() + 1];
        int last = -1;
        for (var ch : s.toCharArray()) {
            if (last != -1 && ((ch == 'B' && c[last] == 'A') || (ch == 'D' && c[last] == 'C'))) {
                last--;
            } else {
                last++;
                c[last] = ch;
            }
        }

        return last + 1;
    }
}
