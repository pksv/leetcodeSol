package com.pksv;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
//        String s = "leetcode";
        String s = "z";
//        String s = "loveleetcode";
//        String s = "aabb";
        System.out.println(new FirstUniqueCharacter().firstUniqChar(s));
    }

    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z'; i++) {
            int index = s.indexOf(i);
            if (index != -1 && index == s.lastIndexOf(i)) {
                ans = Math.min(ans, index);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
