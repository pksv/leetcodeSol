package com.pksv;

public class ReverseBits {
    public static void main(String[] args) {
//        String x = "11111111111111111111111111111101";
        String x = "00000010100101000001111010011100";
        System.out.println(new ReverseBits().reverseBits(Integer.parseUnsignedInt(x, 2)));
    }

    public int reverseBits(int n) {
        StringBuilder b = new StringBuilder(Integer.toBinaryString(n));
        b.reverse();
        while (b.length() < 32) {
            b.append("0");
        }
        return Integer.parseUnsignedInt(b.toString(), 2);
    }
}
