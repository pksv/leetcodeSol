package com.pksv;

public class FractionAdditionSubtraction {
    int i = 0;

    public static void main(String[] args) {
//        String expression = "-1/2+1/2";
//        String expression = "-1/2+1/2+1/3";
//        String expression = "1/3-1/2";
        String expression = "5/3+1/3";
        String s = new FractionAdditionSubtraction().fractionAddition(expression);
        System.out.println(s);
    }

    public String fractionAddition(String expression) {
        String sol;
        char[] c = expression.toCharArray();
        int n = c.length;
        int num = getNumerator(c);
        int deno = getDenominator(c);
        while (i < n) {
            boolean neg = i > 0 && c[i - 1] == '-';
            int n1 = getNumerator(c);
            if (neg) n1 *= -1;
            int n2 = getDenominator(c);
            if (deno == n2) {
                num += n1;
            } else {
                num = num * n2 + n1 * deno;
                deno *= n2;
            }
            i++;
        }
        int gcd = Math.abs(findGCD(num, deno));
        num /= gcd;
        deno /= gcd;
        sol = num + "/" + deno;
        return sol;
    }

    private int findGCD(int a, int b) {
        if (a == 0) return b;
        return findGCD(b % a, a);
    }

    private int getDenominator(char[] c) {
        StringBuilder s = new StringBuilder();
        int n = c.length;
        while (i < n && c[i] != '+' && c[i] != '-') {
            s.append(c[i++]);
        }
        return Integer.parseInt(s.toString());
    }

    private int getNumerator(char[] c) {
        StringBuilder s = new StringBuilder();
        int n = c.length;
        while (i < n && c[i] != '/') {
            s.append(c[i++]);
        }
        i++;
        return Integer.parseInt(s.toString());
    }

}
