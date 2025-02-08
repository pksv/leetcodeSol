package com.pksv;

public class MaximumSwap {
    public static void main(String[] args) {
        int num = 98368;
        System.out.println(new MaximumSwap().maximumSwap(num));
    }

    public int maximumSwap(int num) {
        int[] index = new int[10];
        char[] ch = String.valueOf(num).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            index[ch[i] - '0'] = i;
        }

        for (int i = 0; i < ch.length; i++) {
            for (int j = 9; j > ch[i] - '0'; j--) {
                if (index[j] > i) {
                    var temp = ch[i];
                    ch[i] = ch[index[j]];
                    ch[index[j]] = temp;
                    return Integer.parseInt(new String(ch));
                }
            }
        }
        return num;
    }
}
