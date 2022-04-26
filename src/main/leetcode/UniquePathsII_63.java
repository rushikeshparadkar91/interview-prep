package main.leetcode;

public class UniquePathsII_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0][0] == 1) {
            return 0;
        }

        obstacleGrid[0][0] = 1;

        for (int col = 1; col < obstacleGrid[0].length; col++) {
            obstacleGrid[0][col] = obstacleGrid[0][col] == 0 && obstacleGrid[0][col - 1] == 1 ? 1 : 0;
        }

        for (int row = 1; row < obstacleGrid.length; row++) {
            obstacleGrid[row][0] = obstacleGrid[row][0] == 0 && obstacleGrid[row - 1][0] == 1 ? 1 : 0;
        }

        for (int row = 1; row < obstacleGrid.length; row++) {
            for (int col = 1; col < obstacleGrid[row].length; col++) {
                if (obstacleGrid[row][col] == 0) {
                    obstacleGrid[row][col] += obstacleGrid[row - 1][col] + obstacleGrid[row][col - 1];
                } else {
                    obstacleGrid[row][col] = 0;
                }
            }
        }

        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}
