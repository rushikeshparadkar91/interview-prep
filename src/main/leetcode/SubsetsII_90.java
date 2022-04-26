package main.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: nums = [1,2,2]
 * Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 */
public class SubsetsII_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, result, new ArrayList<Integer>(), 0);
        return result;
    }

    public void dfs(int[] nums, List<List<Integer>> result, List<Integer> temp, int index) {
        result.add(new ArrayList<>(temp));
        for (int i = index; i < nums.length; i++) {
            if (i != index && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            dfs(nums, result, temp, i + 1);
            temp.remove(temp.size() - 1);
        }

    }
}
