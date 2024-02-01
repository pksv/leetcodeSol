package com.pksv.numericals;

public class FirstBadVersion {

    int badVersion = 1702766719;

    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(2126753390));
    }

    boolean isBadVersion(int version) {
        return version >= badVersion;
    }

    public int firstBadVersion(int n) {
        int f = 1;
        int l = n;
        while (f <= l) {
            int m = f + (l - f) / 2;
            if (isBadVersion(m)) {
                l = m - 1;
            } else f = m + 1;
        }
        return f;
    }
}
