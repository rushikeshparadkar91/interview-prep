package main.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
 * Output: 8
 * Explanation: There are:
 * - 1 box of the first type that contains 3 units.
 * - 2 boxes of the second type that contain 2 units each.
 * - 3 boxes of the third type that contain 1 unit each.
 * You can take all the boxes of the first and second types, and one box of the third type.
 * The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
 */
public class MaxUnitsOnTruck_1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((a, b) -> b[1] - a[1]);
        heap.addAll(Arrays.asList(boxTypes));
        int maxUnits = 0;
        while(!heap.isEmpty()) {
            int[] top = heap.poll();
            int count = Math.min(truckSize, top[0]);
            maxUnits += top[1] * count;
            truckSize -= count;
            if (truckSize == 0) break;
        }
        return maxUnits;
    }
}
