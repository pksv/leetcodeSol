package com.pksv;

public class ReverseVowelsString {
    public static void main(String[] args) {
        System.out.println(new ReverseVowelsString().reverseVowels("hello"));
    }

    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int f = 0, l = s.length() - 1;
        while (f <= l) {
            if (checkVowel(c[f]) && checkVowel(c[l])) {
                c[f] = (char) (c[l] + c[f] - (c[l] = c[f]));
                f++;
                l--;
                continue;
            }
            if (checkVowel(c[f])) {
                l--;
                continue;
            }
            f++;
        }
        return new String(c);
    }

    private boolean checkVowel(char s) {
        return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ||
                s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U';
    }
}
