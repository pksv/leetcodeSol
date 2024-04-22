package com.pksv.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveKDigits {
    public static void main(String[] args) {
//        String num = "1432219";
//        String num = "10200";
        String num = "1234567890";
//        String num = "10";
        /*String num;
        try {
            num = new LongInput().getInput();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/
        int k = 9;
        System.out.println(new RemoveKDigits().removeKdigits(num, k));
    }

    public String removeKdigits(String num, int k) {
        if (num.length() <= k) return "0";
        char[] digits = new char[num.length()];
        int iDigits = -1;
        int tempK = k;
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            while (iDigits >= 0 && tempK > 0 && digit < digits[iDigits]) {
                iDigits--;
                tempK--;
            }
            digits[++iDigits] = digit;
        }
        int x = 0;
        while (digits[x] == '0' && x < digits.length - k - 1) {
            x++;
        }
        return String.valueOf(digits, x, digits.length - k - x);
    }
}

class LongInput {
    public String getInput() throws FileNotFoundException {
        File file = new File("D:\\1111\\github\\leetcode\\src\\main\\java\\com\\pksv\\string\\input");
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine());
        }
        return stringBuilder.toString();
    }
}
