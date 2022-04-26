package main.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Input: nums = [1,1,2]
 * Output:
 * [[1,1,2],
 * [1,2,1],
 * [2,1,1]]
 */
public class PermutationsII_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, result, used, new ArrayList<Integer>());
        return new ArrayList<>(result);
    }

    public void dfs(int[] nums, Set<List<Integer>> result, boolean[] used, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                temp.add(nums[i]);
                dfs(nums, result, used, temp);
                used[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
