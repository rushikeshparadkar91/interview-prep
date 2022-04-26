package main.leetcode;

import java.util.Arrays;

/**
 * Input: nums = [-4,-2,2,4], a = -1, b = 3, c = 5
 * Output: [-23,-5,1,7]
 */
public class SortTransformedArray_360 {
    public int[] sortTransformedArray2(int[] nums, int a, int b, int c) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            result[i] = a * x * x + b * x + c;
        }
        Arrays.sort(result);
        return result;
    }

    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int n = nums.length;
        int[] sorted = new int[n];
        int i = 0, j = n - 1;
        int index = a >= 0 ? n - 1 : 0;
        while (i <= j) {
            if (a >= 0) {
                sorted[index--] = quad(nums[i], a, b, c) >= quad(nums[j], a, b, c) ? quad(nums[i++], a, b, c) : quad(nums[j--], a, b, c);
            } else {
                sorted[index++] = quad(nums[i], a, b, c) >= quad(nums[j], a, b, c) ? quad(nums[j--], a, b, c) : quad(nums[i++], a, b, c);
            }
        }
        return sorted;
    }

    private int quad(int x, int a, int b, int c) {
        return a * x * x + b * x + c;
    }
}
