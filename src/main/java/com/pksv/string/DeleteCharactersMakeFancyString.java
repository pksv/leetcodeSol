package com.pksv.string;

public class DeleteCharactersMakeFancyString {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(new DeleteCharactersMakeFancyString().makeFancyString(s));
    }

    public String makeFancyString(String s) {
        if (s.length() < 2) return s;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) continue;
            builder.append(s.charAt(i));
        }
        return builder.append(s.substring(s.length() - 2)).toString();
    }
}
