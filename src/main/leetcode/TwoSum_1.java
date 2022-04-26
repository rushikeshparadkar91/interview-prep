package main.leetcode;

import java.util.HashMap;

public class TwoSum_1 {
    public int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (!map.containsKey(comp)) {
                map.put(nums[i], i);
            } else {
                result[0] = i;
                result[1] = map.get(comp);
            }
        }

        return result;
    }
}
