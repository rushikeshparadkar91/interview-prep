package main.leetcode;

/**
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 */
public class Pow_50 {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double half = myPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return n > 0 ? half * half * x : half * half * (1 / x);
        }
    }


//    pow (10, 2) - > pow (10, 1) - > pow (10, 0)
//          100                10         1
}
