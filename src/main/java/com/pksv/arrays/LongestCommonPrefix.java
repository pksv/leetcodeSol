package com.pksv.arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] input = {"flower", "flow", "flight"};
//        String[] input = {"dog","racecar","car"};
        String[] input = {"ab", "a"};

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(input));
    }

    /*public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        String s1 = strs[0];
        Arrays.sort(strs);
        for (int i = 0; i < s1.length(); i++) {
            boolean flag = true;
            var x = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != x) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.append(x);
            } else break;
        }

        return result.toString();
    }*/
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs)
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        return prefix;
    }
}
