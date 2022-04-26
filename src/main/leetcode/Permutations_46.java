package main.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class Permutations_46 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> permute(int[] nums) {
        //Arrays.sort(nums);
        dfs(nums, new ArrayList<Integer>());
        return result;
    }

    public void dfs(int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            dfs(nums, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
