package main.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class PascalsTriangle_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prev = result.get(i - 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev.get(j) + prev.get(j - 1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
