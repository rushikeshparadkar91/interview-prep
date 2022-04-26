package main.leetcode;

import java.util.Arrays;

/**
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
public class LongestConsecutiveSequence_128 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int currMax = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currMax++;
                } else {
                    max = Math.max(max, currMax);
                    currMax = 1;
                }
            }
        }
        return Math.max(max, currMax);
    }
}
