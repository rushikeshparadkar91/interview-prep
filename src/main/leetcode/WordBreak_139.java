package main.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 */
public class WordBreak_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, new HashSet(wordDict), 0, new Boolean[s.length()]);
    }

    public boolean dfs(String s, Set<String> set, int start, Boolean[] dp) {
        if (start == s.length()) return true;
        if (dp[start] != null) return dp[start];
        for (int mid = start + 1; mid <= s.length(); mid++) {
            if (set.contains(s.substring(start, mid)) && dfs(s, set, mid, dp))
                return dp[start] = true;
        }
        return dp[start] = false;
    }
}
