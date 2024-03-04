package com.pksv.numericals;

public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(new NumberComplement().findComplement(5));
    }

    public int findComplement(int num) {
        String x = Integer.toBinaryString(num);
        StringBuilder y = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i) == '0' ? '1' : '0';
            y.append(c);
        }
        return Integer.parseInt(y.toString(), 2);
    }
}
