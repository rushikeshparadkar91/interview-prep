package main.leetcode;

/**
 * Input: nums = [1,1,1,2,2,3]
 * Output: 5, nums = [1,1,2,2,3,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDupsFromSorted_80 {
    public int removeDuplicates(int[] nums) {
        boolean flag = true;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && flag) {
                flag = false;
                index++;

            } else if (nums[i] != nums[i - 1]) {
                flag = true;
                index++;
            }

            nums[index] = nums[i];
        }

        return index + 1;
    }
}
