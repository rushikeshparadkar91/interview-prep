package main.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: n = 4, k = 2
 * Output:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 */
public class Combinations_77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (n == 0 || k == 0) {
            return result;
        }
        dfs(result, n, new ArrayList<Integer>(), 1, k);
        return result;
    }

    public void dfs(List<List<Integer>> result, int n, List<Integer> temp, int index, int k) {
        if (temp.size() == k) {
            result.add(new ArrayList<Integer>(temp));
        }
        for (int i = index; i <= n; i++) {
            temp.add(i);
            dfs(result, n, temp, i + 1, k);
            temp.remove(temp.size() - 1);
        }
    }
}
