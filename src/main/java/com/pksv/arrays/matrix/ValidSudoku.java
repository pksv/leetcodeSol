package com.pksv.arrays.matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        /*char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};/**/
        /*char[][] board = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};/**/
        /**/
        char[][] board =    {{'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                            {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                            {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                            {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                            {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                            {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                            {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                            {'.', '.', '.', '.', '.', '.', '.', '.', '.'}};/**/

        System.out.println(new ValidSudoku().isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        Set<Character> horizontal = new HashSet<>();
        Set<Character> vertical = new HashSet<>();
        Set<Character> c1 = new HashSet<>();
        Set<Character> c2 = new HashSet<>();
        Set<Character> c3 = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            horizontal = new HashSet<>();
            vertical = new HashSet<>();
            if (i == 0 || i == 3 || i == 6) {
                c1 = new HashSet<>();
                c2 = new HashSet<>();
                c3 = new HashSet<>();
            }
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != '.') {
                    if (vertical.contains(board[j][i])) return false;
                    vertical.add(board[j][i]);
                }
                if (board[i][j] != '.') {
                    if (horizontal.contains(board[i][j])) return false;
                    horizontal.add(board[i][j]);
                    if (j <= 2) {
                        if (c1.contains(board[i][j])) return false;
                        c1.add(board[i][j]);
                    } else if (j <= 5) {
                        if (c2.contains(board[i][j])) return false;
                        c2.add(board[i][j]);
                    } else {
                        if (c3.contains(board[i][j])) return false;
                        c3.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
