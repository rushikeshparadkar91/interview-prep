package main.leetcode;

/**
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGame_55 {
    public boolean canJump(int[] nums) {

        int maxReachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxReachable < i) return false;
            maxReachable = Math.max(maxReachable, i + nums[i]);
        }

        return true;
    }
}
