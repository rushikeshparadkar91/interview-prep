package main.leetcode;

public class StringToInt_8 {
    public int myAtoi(String s) {
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        int sign = 1;
        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        int result = 0;
        while (i < s.length()) {
            int digit = s.charAt(i) - '0';
            if (digit < 0 || digit > 9) break;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
