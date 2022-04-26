package main.leetcode;

/**
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 */
public class MaxProductSubArray_152 {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(nums[i], nums[i] * max), nums[i] * min);
            min = Math.min(Math.min(nums[i], nums[i] * temp), nums[i] * min);
            result = Math.max(result, max);
        }

        return result;
    }
}
