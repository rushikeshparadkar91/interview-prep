package main.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 */
public class Subsets_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        dfs(result, nums, new ArrayList<Integer>(), 0);
        return result;
    }

    public void dfs(List<List<Integer>> result, int[] nums, List<Integer> temp, int index) {
        result.add(new ArrayList<Integer>(temp));
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(result, nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
