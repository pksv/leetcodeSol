package com.pksv.others_or_repeated;

public class ValidPalindrome {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
        String s = " apG0i4maAs::sA0m4i0Gp0";
//        String s = "race a car";
        System.out.println(new ValidPalindrome().isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();
        int l = 0, r = s.length() - 1;
        var ch = s.toCharArray();
        while (l < r) {
            if (!(ch[l] >= '0' && ch[l] <= '9') && !(ch[l] >= 'a' && ch[l] <= 'z')) {
                l++;
            }
            if (!(ch[r] >= '0' && ch[r] <= '9') && !(ch[r] >= 'a' && ch[r] <= 'z')) {
                r--;
            }
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
