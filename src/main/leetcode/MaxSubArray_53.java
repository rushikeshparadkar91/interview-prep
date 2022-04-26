package main.leetcode;

/**
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 *
 * max = 6
 * dp [] array as below
 * [-2  1   -3  4   -1   2   1  -5    4]
 *  -2  1   -2  4   3    5   6   1    5
 */
public class MaxSubArray_53 {
    public int maxSubArray(int[] A) {
        int n = A.length;
        int[] dp = new int[n];    //dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = A[i] + (Math.max(dp[i - 1], 0));
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
