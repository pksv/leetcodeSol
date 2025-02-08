package com.pksv.others_or_repeated;

public class PaintElectricPoles {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1}};
//        int[][] arr = {{
//                1, 1, 1}, {
//                1, 1, 1}, {
//                1, 1, 1}};
        System.out.println(new PaintElectricPoles().costOfPainting(arr));
    }

    public int costOfPainting(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][0] += arr[i][j];
            }
        }

        int ans = 0;
        for (int[] val : arr) {
            if (val[0] != 0) {
                ans++;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i][0] == 0) {
                ans--;
            } else break;
        }
        return Math.max(ans, 0);
    }
}
