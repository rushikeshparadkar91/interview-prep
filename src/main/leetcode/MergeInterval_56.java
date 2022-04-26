package main.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 */
public class MergeInterval_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }

            merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
        }

        return merged.toArray(new int[merged.size()][]);
    }
}