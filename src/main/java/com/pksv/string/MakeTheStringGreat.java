package com.pksv.string;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        System.out.println(new MakeTheStringGreat().makeGood("leEeetcode"));
    }

    public String makeGood(String s) {
        var x = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char value : x) {
            char c = builder.isEmpty() ? 0 : builder.charAt(builder.length() - 1);
            if (value == c + 32 || value == c - 32) {
                builder.deleteCharAt(builder.length() - 1);
                continue;
            }
            builder.append(value);
        }
        return builder.toString();
    }
}
