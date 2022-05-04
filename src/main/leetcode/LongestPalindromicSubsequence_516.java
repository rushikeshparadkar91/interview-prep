package main.leetcode;

/**
 * Input: s = "bbbab"
 * Output: 4
 * Explanation: One possible longest palindromic subsequence is "bbbb".
 */
public class LongestPalindromicSubsequence_516 {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        return lps(s, 0, s.length()-1, dp);
    }

    public int lps(String s, int l, int r, int[][] dp) {
        if (l > r) return 0;
        else if (l == r) return 1;
        else if (dp[l][r] > 0) return dp[l][r];
        else {
            dp[l][r] = s.charAt(l) == s.charAt(r) ? 2 + lps(s, l+1, r-1, dp) : Math.max(lps(s, l+1, r, dp), lps(s, l, r-1, dp));
            return dp[l][r];
        }
    }
}
