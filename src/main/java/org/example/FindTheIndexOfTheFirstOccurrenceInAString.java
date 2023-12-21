package org.example;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public static void main(String[] args) {
//        String haystack = "sadbutsad", needle = "sad";
        String haystack = "leetcode", needle = "leeto";
        System.out.println(new FindTheIndexOfTheFirstOccurrenceInAString().strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
