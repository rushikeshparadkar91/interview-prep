package main.leetcode;

/**
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 */
public class ReverseWordsInString_151 {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = parts.length-1; i>0; i--) {
            sb.append(parts[i]).append(" ");
        }

        return sb.append(parts[0]).toString();
    }
}
