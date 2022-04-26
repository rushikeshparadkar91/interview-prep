package main.leetcode;

public class StrStr_28 {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (n < m) return -1;

        for (int i = 0; i <= n - m; i++) {
            String s = haystack.substring(i, i + m);
            if (needle.equals(s)) {
                return i;
            }
        }

        return -1;
    }
}
