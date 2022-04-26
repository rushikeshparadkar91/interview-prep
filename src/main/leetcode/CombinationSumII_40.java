package main.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 */
public class CombinationSumII_40 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<Integer>());
        return result;
    }

    public void dfs(int[] a, int sum, int index, List<Integer> temp) {
        if (sum < 0) return;
        if (sum == 0) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = index; i < a.length; i++) {
            if (i != index && a[i] == a[i - 1]) continue;
            temp.add(a[i]);
            dfs(a, sum - a[i], i + 1, temp); // i + 1 since we cannot take the same index number
            temp.remove(temp.size() - 1);
        }
    }
}
