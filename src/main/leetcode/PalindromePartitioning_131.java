package main.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 */
public class PalindromePartitioning_131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        dfs(0, result, new ArrayList<String>(), s);
        return result;
    }

    public void dfs(int start, List<List<String>> result, List<String> temp, String s) {
        if (start >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                temp.add(s.substring(start, end + 1));
                dfs(end + 1, result, temp, s);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
