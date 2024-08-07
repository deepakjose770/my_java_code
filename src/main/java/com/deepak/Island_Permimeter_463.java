package com.deepak;

public class Island_Permimeter_463 {

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int row = grid.length;
        int column = grid[0].length;

        for (int i = 0; i<row; i++) {
            for (int j=0; j< column; j++) {
                if (grid[i][j] == 1) {
                    perimeter = perimeter + 4;

                    if( i < row - 1 && grid[i+1][j] == 1) {
                        perimeter = perimeter - 2;
                    }
                    if (j < column -1 &&grid[i][j + 1] == 1) {
                        perimeter = perimeter - 2;
                    }
                }
            }
        }
        return perimeter;
    }
}
