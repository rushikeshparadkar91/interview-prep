package main.leetcode;

/**
 * Input: s = "(*))"
 * Output: true
 */
public class ValidParantheses_678 {

    public boolean checkValidString2(String s) {
        int lo = 0; int hi = 0;
        for (char c: s.toCharArray()) {
            lo += c == '(' ? 1 : -1;
            hi += c != ')' ? 1 : -1;
            if (hi < 0) break;
            lo = Math.max(lo, 0);
        }
        return lo == 0;
    }

    public boolean checkValidString(String s) {
        // Iterate from left - > right and count left
        int left = 0;
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '*') left++;
            else left--;
            if (left < 0) return false;
        }

        if (left == 0) return true;

        // Iterate from right -> left and count right
        int right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || s.charAt(i) == '*') right++;
            else right--;
            if (right < 0) return false;
        }

        return true;
    }
}
