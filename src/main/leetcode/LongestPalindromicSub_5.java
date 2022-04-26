package main.leetcode;

public class LongestPalindromicSub_5 {
    int max;
    int low;

    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        if (s.length() < 2) return s;

        for(int i = 0; i < s.length() - 1; i++) {
            extend(s, i, i);
            extend(s, i, i + 1);
        }

        return s.substring(low, low+max);
    }

    public void extend(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--; j++;
        }

        if (j - i - 1 > max) {
            max = j - i - 1;
            low = i + 1;
        }
    }
}
