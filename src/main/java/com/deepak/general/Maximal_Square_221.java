package com.deepak.general;

public class Maximal_Square_221 {

    public static void main(String[] args) {
        char[][] matrix1 = {
                {'1', '0', '1', '0', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '0', '0', '1', '0'}
        };

        System.out.println(new Maximal_Square_221().maximalSquareOne(matrix1));
    }

    public int maximalSquareOne(char[][] matrix) {
        if (matrix.length ==0 || matrix[0].length ==0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dpArray = new int[m][n];

        int maxSquareSize = 0;

        for (int i=0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (matrix[i][j] == '1') {
                    if (i==0 || j==0) {
                        dpArray[i][j] = 1;
                    } else {
                        dpArray[i][j] = Math.min(Math.min(dpArray[i][j-1], dpArray[i-1][j]), dpArray[i-1][j-1]) + 1;
                    }
                    maxSquareSize = Math.max(maxSquareSize, dpArray[i][j]);
                }
            }
        }
        return maxSquareSize * maxSquareSize;
    }


    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dpArray = new int[m][n];

        int maxSquareSize = 0;

        for (int i=0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (matrix[i][j] == '1') {
                    dpArray[i+1][j+1] = Math.min(Math.min(matrix[i+1][j], matrix[i][j+1]), matrix[i][j]);
                    maxSquareSize = Math.max(maxSquareSize, dpArray[i+1][j+1]);
                }
            }
        }
        return maxSquareSize * maxSquareSize;
    }


}
