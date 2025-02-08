package com.pksv.string;

//Sum of Digits of String After Convert
public class SumOfDigitsString {
    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
        System.out.println(new SumOfDigitsString().getLucky(s, k));
    }

    public int getLucky(String s, int k) {
        String converted = s;

        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (var c : converted.toCharArray()) {
                if (i == 0) {
                    int x = c - 'a' + 1;
                    while (x > 0) {
                        int rem = x % 10;
                        sum += rem;
                        x /= 10;
                    }
                } else sum += c - '0';
            }
            converted = sum + "";
            if (converted.length() == 1) break;
        }

        return Integer.parseInt(converted);
    }

    private String convert(String s) {
        StringBuilder builder = new StringBuilder();
        for (var c : s.toCharArray()) {
            builder.append(c - 'a' + 1);
        }
        return builder.toString();
    }
}
