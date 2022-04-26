package main.leetcode;

public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;
        int i = s.length() - 1;
        int count = 0;
        while (i >= 0 && s.charAt(i) == ' ') i--;
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            count++;
        }

        return count;
    }
}
