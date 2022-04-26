package main.leetcode;

/**
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 *
 * Input: columnTitle = "AB"
 * Output: 28
 */
public class ExcelSheetColNumber_171 {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int i = 0;
        while (i < columnTitle.length()) {
            result = result * 26 + columnTitle.charAt(i) - 'A' + 1;
            i++;
        }

        return result;
    }
}
