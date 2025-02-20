package com.pksv.string;

import java.util.Arrays;
import java.util.List;

public class FindUniqueBinaryString {
    public static void main(String[] args) {
//        String[] nums = {"01", "10"};
        String[] nums = {"111","011","001"};
        System.out.println(new FindUniqueBinaryString().findDifferentBinaryString(nums));
    }

    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        List<String> list = Arrays.asList(nums);
        int i = Integer.parseInt("1".repeat(n), 2);
        for (int j = 0; j <= i; j++) {
            StringBuilder x = new StringBuilder(Integer.toBinaryString(j));
            while (x.length() < n){
                x.insert(0, "0");
            }
            if(!list.contains(x.toString()))
                return x.toString();
        }
        System.out.println(i);
        return "";
    }

    public String findDifferentBinaryString2(String[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        return sb.toString();
    }

}
