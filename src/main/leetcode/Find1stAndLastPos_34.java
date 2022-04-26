package main.leetcode;

public class Find1stAndLastPos_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        int left = searchIndex(nums, target, true);
        if (left == nums.length || nums[left] != target) {
            return result;
        }

        result[0] = left;
        result[1] = searchIndex(nums, target, false) - 1;

        return result;
    }

    public int searchIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && nums[mid] == target)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}
