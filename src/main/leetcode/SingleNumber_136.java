package main.leetcode;

/**
 * Input: nums = [2,2,1]
 * Output: 1
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int n : nums) {
            a = a ^ n;
        }
        return a;
    }
}
