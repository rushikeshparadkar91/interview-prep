package main.leetcode;

/**
 * Input: columnNumber = 28
 * Output: "AB"
 * <p>
 * Input: columnNumber = 701
 * Output: "ZY"
 */
public class ExcelSheetColumnTitle_168 {
    public String convertToTitle(int n) {
        String result = "";
        while (n > 0) {
            n--;
            result = (char) ('A' + (n % 26)) + result;
            n /= 26;
        }

        return result;
    }
}
