package main.leetcode;

/**
 * Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
 * Output: 6
 * Explanation: The answer is not 11, because the island must be connected 4-directionally.
 */
public class MaxAreaOfIsland_695 {
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        boolean[][] seen = new boolean[grid.length][grid[0].length];

        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[0].length; c++)
                if (grid[r][c] == 1)
                    ans = Math.max(ans, dfs(grid, seen, r, c));

        return ans;
    }

    public int dfs(int[][] grid, boolean[][] seen, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || seen[r][c] || grid[r][c] == 0)
            return 0;

        seen[r][c] = true;
        return  1 + dfs(grid, seen, r + 1, c)
                + dfs(grid, seen, r - 1, c)
                + dfs(grid, seen, r, c + 1)
                + dfs(grid, seen, r, c - 1);
    }
}
