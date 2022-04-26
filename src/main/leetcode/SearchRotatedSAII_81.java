package main.leetcode;

/**
 * Input: nums = [2,5,6,0,0,1,2], target = 0
 * Output: true
 */
public class SearchRotatedSAII_81 {
    public boolean search2(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[mid] == nums[start])
                start++;   //"duplicate", jump
            else if (nums[mid] > nums[start]) {
                if (nums[mid] > target && nums[start] <= target)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (nums[mid] < target && nums[end] >= target)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
}
