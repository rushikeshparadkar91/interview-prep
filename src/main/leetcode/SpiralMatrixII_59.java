package main.leetcode;

public class SpiralMatrixII_59 {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        int count = 1;
        int left = 0, top = 0;
        int right = n - 1, bottom = n - 1;

        while (left <= right) {
            for (int col = left; col <= right; col++) {
                m[top][col] = count++;
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                m[row][right] = count++;
            }
            right--;

            for (int col = right; col >= left; col--) {
                m[bottom][col] = count++;
            }

            bottom--;
            for(int row = bottom; row >= top; row--) {
                m[row][left] = count++;
            }
            left++;
        }
        return m;
    }

}
