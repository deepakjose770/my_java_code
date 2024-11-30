package com.deepak.general;

public class Number_Of_Islands_200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length ==0) {
            return 0;
        }

        int islandCount = 0;
        int rows= grid.length;
        int columns = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    depthFirstSearch(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private void depthFirstSearch(char[][] grid, int i, int j) {
        if (i<0 || j<0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        depthFirstSearch(grid, i-1, j);
        depthFirstSearch(grid, i, j-1);
        depthFirstSearch(grid, i+1, j);
        depthFirstSearch(grid, i, j+1);
    }
}
