package com.pksv.string;

public class IntegerToEnglishWords {
    public static void main(String[] args) {
        int num = 101;
        System.out.println(new IntegerToEnglishWords().numberToWords(num));
    }

    public String numberToWords(int num) {
        String b;
        if (num == 0) return "Zero";
        b = getHundreds(num % 1000);
        num /= 1000;
        if (num > 0 && num % 1000 > 0) {
            b = getHundreds(num % 1000).trim() + " Thousand " + b;
        }
        num /= 1000;
        if (num > 0 && num % 1000 > 0) {
            b = getHundreds(num % 1000).trim() + " Million " + b;
        }
        num /= 1000;
        if (num > 0) {
            b = getHundreds(num % 1000).trim() + " Billion " + b;
        }
        return b.trim();
    }

    private String getHundreds(int num) {
        String[] digits = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        StringBuilder b = new StringBuilder();
        if (num > 99) {
            b.append(digits[num / 100]).append(" Hundred ");
            num %= 100;
        }
        if (num < 20 && num > 9) {
            b.append(teens[num % 10]).append(" ");
        } else {
            if (num > 19) {
                b.append(tens[num / 10]).append(" ");
            } b.append(digits[num % 10]);
        }
        return b.toString();
    }
}
