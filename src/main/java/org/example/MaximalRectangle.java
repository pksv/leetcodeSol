package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximalRectangle {

    public static void main(String[] args) {
        char[][] input = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'0', '1', '1', '1', '1'},
                {'0', '1', '1', '1', '1'},
                {'0', '1', '1', '1', '1'},
                {'1', '0', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        var start = System.currentTimeMillis();
        List<Character[]> x = generateSubMatrices(input);
//        var x = maximalRectangle(input);
        var end = System.currentTimeMillis();
        int max = 0;
        for (Character[] z : x) {
            max = Math.max(z.length, max);
        }
        System.out.println("result = " + max + " size = " + x.size());
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        System.out.println("diff = " + (end - start));
    }

    /*public static int rectangle(String[][] input) {
        if (input.length == 1 && input[0].length == 1) {
            if (input[0][0].equals("1")) return 1;
            if (input[0][0].equals("0")) return 0;
        }
        int area = 0;
        var x = onesPos(input);
        for (int i = 0; i < x.size(); i++) {

        }

        System.out.println("input.length: " + input.length + "input[0].length: " + input[0].length);

        return area;
    }

    public static List<Integer[]> onesPos(String[][] input) {
        List<Integer[]> ones = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j].equals("1")) {
                    ones.add(new Integer[]{i, j});
                }
            }
        }
        return ones;
    }*/

    public static List<Character[]> generateSubMatrices(char[][] matrix) {
        List<Character[]> subMatrices = new ArrayList<>();
        Set<List<Character>> uniq = new HashSet<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = i; k < rows; k++) {
                    for (int l = j; l < cols; l++) {
                        List<Character> subMatrix = new ArrayList<>();
                        for (int m = i; m <= k; m++) {
                            for (int n = j; n <= l; n++) {
                                subMatrix.add(matrix[m][n]);
                            }
                        }
                        if (subMatrix.contains('0')) {
                            break;
                        }
                        if (uniq.add(subMatrix)) {
                            subMatrices.add(subMatrix.toArray(new Character[0]));
                        }
                    }
                }
            }
        }

        return subMatrices.stream().toList();
    }


    public static int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        if (row == 0)
            return 0;
        int col = matrix[0].length;
        int max = 0;
        int[][] dp = new int[row][col];
        // calculate the height
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                    System.out.println("dp[i][j]" + dp[i][j]);
                } else {
                    if (matrix[i][j] == '1')
                        dp[i][j] = dp[i - 1][j] + matrix[i][j] - '0';
                }
            }
        }
        for (int[] eachRow : dp) {
            var x = largestRectangleHistogram(eachRow);
            max = Math.max(max, x);
            System.out.println("max = " + max + " ,x=" + x);
        }
        return max;
    }

    // same code for largest rectangle in a histogram
    public static int largestRectangleHistogram(int[] h) {
        if (h == null || h.length == 0)
            return 0;
        int length = h.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int max = 0;
        left[0] = -1;
        right[length - 1] = length;
        for (int i = 1; i < length; i++) {
            int currentIndex = i - 1;
            while (currentIndex >= 0 && h[currentIndex] >= h[i]) {
                System.out.println("currentIndex = " + currentIndex);
                currentIndex = left[currentIndex];
                System.out.println("currentIndex = " + currentIndex);
            }
            left[i] = currentIndex;
            System.out.println("i = " + i + ", left[i] = " + left[i]);
        }
        for (int i = length - 2; i >= 0; i--) {
            int currentIndex = i + 1;
            while (currentIndex < length && h[currentIndex] >= h[i]) {
                System.out.println("currentIndex = " + currentIndex);
                currentIndex = right[currentIndex];
                System.out.println("currentIndex = " + currentIndex);
            }
            right[i] = currentIndex;
            System.out.println("i = " + i + ", right[i] = " + right[i]);
        }
        for (int i = 0; i < length; i++) {
            var x = h[i] * (right[i] - left[i] - 1);
            System.out.println("x = " + x);
            max = Math.max(max, x);
            System.out.println("max = " + max);
        }
        return max;
    }

}
