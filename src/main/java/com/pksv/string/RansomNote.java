package com.pksv.string;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {
    public static void main(String[] args) {
//        String ransomNote = "a", magazine = "b";
//        String ransomNote = "aa", magazine = "ab";
        String ransomNote = "aa", magazine = "aab";
        System.out.println(new RansomNote().canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        List<Character> mag = new ArrayList<>();
        for (char c : magazine.toCharArray()) {
            mag.add(c);
        }
        for (Character c : ransomNote.toCharArray()) {
            if (mag.contains(c)) mag.remove(c);
            else return false;
        }
        return true;
    }
}
