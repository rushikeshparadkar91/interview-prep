package main.leetcode;

/**
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: true
 */
public class CanPlaceFlowers_605 {
    public boolean canPlaceFlowers(int[] bed, int n) {
        int count = 0;
        for (int i = 0; i < bed.length; i++) {
            if (bed[i] == 0 && (i==0 || bed[i-1] == 0) && (i==bed.length-1 || bed[i+1] == 0)) {
                count++;
                bed[i] = 1;
            }
        }
        return count >= n;
    }
}
