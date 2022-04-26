package main.leetcode;

public class SqrtofX_69 {
    public int mySqrt(int x) {
        int ans = 1;
        int start = 1;
        int end = x;
        while (start < end) {
            int mid = ((start + end) / 2);
            if (mid > (x/mid)) {
                end = mid;
            } else {
                start = mid + 1;
                ans = mid;
            }
        }

        return ans;
    }
}
