package main.leetcode;

public class ClimbStairs_70 {
    public int climbStairs(int n) {
        if (n < 2) return 1;
        int a = 1;
        int b = 1;
        int c = 0;
        int i = 2;
        while (i++ <= n) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
