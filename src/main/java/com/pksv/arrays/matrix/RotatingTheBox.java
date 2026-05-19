package com.pksv.arrays.matrix;

import java.util.Arrays;

public class RotatingTheBox {
    public static void main(String[] args) {

//        char[][] boxGrid = {{'#', '#', '*', '.', '*', '.'},
//                {'#', '#', '#', '*', '.', '.'},
//                {'#', '#', '#', '.', '#', '.'}};

        char[][] boxGrid = {{'#', '.', '*', '.'},
                {'#', '#', '*', '.'}};
//        char[][] boxGrid = {{'#', '.', '#'}};

        var result = new RotatingTheBox().rotateTheBox(boxGrid);
        for (var row : result)
            System.out.println(Arrays.toString(row));
    }

    public char[][] rotateTheBox(char[][] boxGrid) {
        char[][] result = new char[boxGrid[0].length][boxGrid.length];
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][m - 1 - i] = boxGrid[i][j];
            }
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (result[i][j] == '.' && result[i - 1][j] == '#') {
                    bubbleSort(result, i, j);
                }
            }
        }
        return result;
    }

    public void bubbleSort(char[][] box, int row, int column) {
        while (row < box.length) {
            if (box[row][column] == '#') {
                return;
            }
            if (box[row][column] == '*') {
                return;
            }
            box[row][column] = '#';
            box[row - 1][column] = '.';
            row++;
        }
    }
}
