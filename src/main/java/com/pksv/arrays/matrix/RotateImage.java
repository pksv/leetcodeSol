package com.pksv;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        new RotateImage().rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int row = 0; row < n / 2; row++) {
            int bottom = n - row - 1;
            for (int col = 0; col < n; col++) {
                int temp = matrix[col][row];
                matrix[col][row] = matrix[col][bottom];
                matrix[col][bottom] = temp;
            }
        }
    }
}
