package main.leetcode;

/**
 * Input: num = 16
 * Output: true
 */
public class ValidPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        int start = 1; int end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == num) return true;
            else if (mid * mid > num) end = (int) mid - 1;
            else start = (int) mid + 1;
        }
        return false;
    }
}
