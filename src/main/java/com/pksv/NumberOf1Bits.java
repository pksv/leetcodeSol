package com.pksv;

public class NumberOf1Bits {
    public static void main(String[] args) {
        String x = "11111111111111111111111111111101";
//        var s = Integer.parseUnsignedInt(x,2);
        System.out.println(new NumberOf1Bits().hammingWeight(Integer.parseUnsignedInt(x, 2)));
    }

    public int hammingWeight(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            count += (n & 1);
            n = n >>> 1;
//            if (((n >> i) & 1) == 1) {
//                count++;
//            }

//            if (s.charAt(i) == '1') {
//                count++;
//            }
        }
        return count;

    }
}
