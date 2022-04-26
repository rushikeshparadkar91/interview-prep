package main.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [2,2,3,2]
 * Output: 3
 */
public class SingleNumberII_137 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int n: nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        for (int k: map.keySet()) {
            if (map.get(k) == 1) return k;
        }

        return -1;
    }
}
