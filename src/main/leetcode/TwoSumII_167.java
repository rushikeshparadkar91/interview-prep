package main.leetcode;

/**
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */
public class TwoSumII_167 {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int[] result = new int[2];
        while (l < r) {
            if (nums[l] + nums[r] == target) {
                result[0] = l + 1;
                result[1] = r + 1;
                return result;
            } else if (nums[l] + nums[r] > target) {
                r--;
            } else {
                l++;
            }
        }

        return result;
    }
}
