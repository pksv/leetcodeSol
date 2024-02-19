package com.pksv.string;

public class AddStrings {
    public static void main(String[] args) {
//        String num1 = "456", num2 = "77";
//        String num1 = "0", num2 = "0";
//        String num1 = "1", num2 = "9";
        String num1 = "9", num2 = "99";
//        String num1 = "9133", num2 = "0";
        System.out.println(new AddStrings().addStrings(num1, num2));
    }

    public String addStrings(String num1, String num2) {
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        while (n1 >= 0 || n2 >= 0) {
            int a = n1 < 0 ? 0 : num1.charAt(n1) - '0';
            int b = n2 < 0 ? 0 : num2.charAt(n2) - '0';
            n1--;
            n2--;
            int c = a + b + carry;
            carry = c / 10;
            sum.append(c % 10);
        }
        if (carry != 0) sum.append(carry);
        return sum.reverse().toString();
    }
}
