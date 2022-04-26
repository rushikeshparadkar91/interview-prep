package main.leetcode;

/**
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */
public class FindMinInRSA_153 {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (nums[start] > nums[end]) {
            int mid = (start + end) / 2;
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }
}
