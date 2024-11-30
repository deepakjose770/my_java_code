package com.deepak.general;

import java.util.Arrays;

public class Surrounded_Regions_130 {

    public static void main(String[] args) {
        Surrounded_Regions_130 obj = new Surrounded_Regions_130();
        char[][] board1 = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        obj.solve(board1);
        System.out.println(Arrays.deepToString(board1));

        char[][] board2 = {
                {'X', 'X', 'X'},
                {'X', 'O', 'X'},
                {'X', 'X', 'X'}
        };
        obj.solve(board2);
        System.out.println(Arrays.deepToString(board2));
    }


    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int nOfRows = board.length;
        int noOfColumns = board[0].length;

        for (int i = 0; i < nOfRows; i++) {
            if (board[i][0] == 'O') {
                depthFirstSearchOnBoard(board, i, 0);
            }
            if (board[i][noOfColumns-1] == 'O') {
                depthFirstSearchOnBoard(board, i, noOfColumns-1);
            }
        }

        for (int i = 0; i < noOfColumns; i++) {
            if (board[0][i] == 'O') {
                depthFirstSearchOnBoard(board,0,i);
            }
            if (board[nOfRows-1][i] == 'O') {
                depthFirstSearchOnBoard(board, nOfRows-1, i);
            }
        }

        for (int i = 0; i < nOfRows; i++) {
            for (int j = 0; j < noOfColumns; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'D') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void depthFirstSearchOnBoard(char[][] board, int i, int j) {
        if (i < 0 || j<0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = 'D';
        depthFirstSearchOnBoard(board, i-1,j);
        depthFirstSearchOnBoard(board, i,j-1);
        depthFirstSearchOnBoard(board, i+1,j);
        depthFirstSearchOnBoard(board, i,j+1);
    }
}
