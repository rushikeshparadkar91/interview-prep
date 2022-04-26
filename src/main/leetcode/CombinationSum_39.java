package main.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 **/
public class CombinationSum_39 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, 0, new ArrayList<Integer>());
        return result;
    }

    public void dfs(int[] a, int sum, int index, List<Integer> temp) {
        if (sum < 0) return;
        if (sum == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < a.length; i++) {
            temp.add(a[i]);
            dfs(a, sum - a[i], i, temp);  // i because we can take the same number index.
            temp.remove(temp.size() - 1);
        }
    }
}
