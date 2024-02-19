package com.pksv.string;

public class NumberOfSegmentsInString {
    public static void main(String[] args) {
//        String s = ", , , ,        a, eaefa";
        String s = "    foo    bar";
        System.out.println(new NumberOfSegmentsInString().countSegments(s));
    }

    public int countSegments(String s) {
        if (s.trim().isEmpty()) return 0;
        String[] x = s.trim().split("\\s+");
        return x.length;
    }
}
