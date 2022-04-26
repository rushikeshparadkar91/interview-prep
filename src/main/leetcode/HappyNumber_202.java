package main.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber_202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (set.add(n)) {
            int sum = 0;
            while (n != 0) {
                int pop = n % 10;
                sum += pop * pop;
                n /= 10;
            }
            if (sum == 1) return true;
            n = sum;
        }

        return false;
    }
}
