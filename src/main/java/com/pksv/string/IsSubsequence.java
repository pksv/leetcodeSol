package com.pksv.string;

public class IsSubsequence {
    public static void main(String[] args) {
//        String s = "abc", t = "ahbgdc";
        String s = "axc", t = "ahbgdc";
        System.out.println(new IsSubsequence().isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() == t.length() && !s.equals(t)) return false;
        int pos = -1;
        for (var c : s.toCharArray()) {
            pos = t.indexOf(c, pos + 1);
            if (pos == -1) {
                return false;
            }
        }
        return true;
    }
}
