package main.leetcode;

/**
 * Input: s = "leetcode"
 * Output: 5
 * Explanation: Inserting 5 characters the string becomes "leetcodocteel".
 *
 * Input: s = "mbadm"
 * Output: 2
 * Explanation: String can be "mbdadbm" or "mdbabdm".
 *
 * Input: s = "zzazz"
 * Output: 0
 * Explanation: The string "zzazz" is already palindrome we don't need any insertions.
 */
public class MinInsertionToMakeStringPalindrome_1312 {
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }

    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        return lps(s, 0, s.length()-1, dp);
    }

    public int lps(String s, int l, int r, int[][] dp) {
        if (l > r) return 0;
        else if (l == r) return 1;
        else if (dp[l][r] > 0) return dp[l][r];
        else {
            dp[l][r] = s.charAt(l) == s.charAt(r) ?
                    2 + lps(s, l+1, r-1, dp) :
                    Math.max(lps(s, l+1, r, dp), lps(s, l, r-1, dp));

            return dp[l][r];
        }
    }
}
