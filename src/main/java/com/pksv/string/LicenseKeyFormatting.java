package com.pksv.string;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
//        String s = "5F3Z-2e-9-w";
        String s = "2-5g-3-J";
        int k = 2;
        System.out.println(new LicenseKeyFormatting().licenseKeyFormatting2(s, k));
    }

    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();
        if (s.length() <= 1) return s;
        StringBuilder result = new StringBuilder();
        int x = s.length() % k;
        if (x != 0) {
            result.append(s, 0, x).append("-");
        }
        for (int i = x; i < s.length(); i += k) {
            result.append(s, i, i + k).append("-");
        }
        return result.deleteCharAt(result.length() - 1).toString();
    }

    public String licenseKeyFormatting2(String s, int k) {
        StringBuilder result = new StringBuilder();
        int len = k;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '-') continue;
            if (len == 0) {
                result.append("-");
                len = k;
            }
            len--;
            result.append(Character.toUpperCase(s.charAt(i)));
        }
        return result.reverse().toString();
    }
}
