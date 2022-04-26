package main.leetcode;

/**
 * Input: a = "11", b = "1"
 * Output: "100"
 */
public class AddBinary_67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int v = 0;
        int c = 0;
        while (i >= 0 || j >= 0) {
            v = c;
            if (i >= 0) {
                v += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                v += b.charAt(j--) - '0';
            }
            sb.append(v % 2);
            c = v / 2;
        }
        if (c > 0) sb.append(c);

        return sb.reverse().toString();
    }
}