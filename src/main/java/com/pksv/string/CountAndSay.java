package com.pksv;

import java.util.ArrayList;
import java.util.List;

public class CountAndSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(new CountAndSay().countAndSay(n));
    }

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String result = "1";
        for (int i = 1; i < n; i++) {
            List<String[]> freq = getCount(result);
            result = getSay(freq);
        }
        return result;
    }

    private String getSay(List<String[]> freq) {
        StringBuilder s = new StringBuilder();
        for (var f : freq) {
            s.append(f[0]).append(f[1]);
        }
        return s.toString();
    }

    private List<String[]> getCount(String s) {
        char curr = s.charAt(0);
        int count = 0;
        List<String[]> arr = new ArrayList<>();
        for (var c : s.toCharArray()) {
            if (c == curr) count++;
            else {
                arr.add(new String[]{String.valueOf(count), String.valueOf(curr)});
                curr = c;
                count = 1;
            }
        }
        arr.add(new String[]{String.valueOf(count), String.valueOf(s.charAt(s.length() - 1))});
        return arr;
    }
}
