package com.pksv.adobe;

public class HackerConfusing {

    public static void main(String[] args) {
        System.out.println(new HackerConfusing().game(999999999));
    }

    /*private int game(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int x = i;
            StringBuilder s = new StringBuilder();
            boolean flag = false;
            String input = String.valueOf(i);
            if (input.contains("2") || input.contains("3") || input.contains("4") || input.contains("5") || input.contains("7")) {
                continue;
            }
            while (x > 0) {
                int rem = x % 10;
                if (rem == 0) s.append(0);
                else if (rem == 1) s.append(1);
                else if (rem == 6) s.append(9);
                else if (rem == 8) s.append(8);
                else if (rem == 9) s.append(6);
                else {
                    flag = true;
                    break;
                }
                x /= 10;

            }
            int invert = 0;
            if (!s.isEmpty()) invert = Integer.parseInt(s.toString());
            if (!flag && invert != i) {
                count++;
            }
        }

        return count;
    }*/

    private int game(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int x = i;
            int reversed = 0;
            String s = String.valueOf(x);
            if (s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("7")) {
                break;
            }
            while (x > 0) {
                int digit = x % 10;
                if (digit == 0 || digit == 1 || digit == 8)
                    reversed = reversed * 10 + digit;
                else if (digit == 6)
                    reversed = reversed * 10 + 9;
                else reversed = reversed * 10 + 6;
                x /= 10;
            }

            if (reversed != i) {
                count++;
            }
        }

        return count;
    }
}
