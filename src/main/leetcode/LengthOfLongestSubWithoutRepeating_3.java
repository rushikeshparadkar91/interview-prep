package main.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubWithoutRepeating_3 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, ans = 0;
        int n = s.length();
        Set<Character> set = new HashSet<Character>();

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return ans;
    }
}
