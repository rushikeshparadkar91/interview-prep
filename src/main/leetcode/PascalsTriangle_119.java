package main.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 *
 */
public class PascalsTriangle_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        for (int i = 0; i < rowIndex; i++) {
            result.add(0, 1);
            for (int j = 1; j < result.size() - 1; j++) {
                result.set(j, result.get(j) + result.get(j+1));
            }
        }

        return result;
    }
}
