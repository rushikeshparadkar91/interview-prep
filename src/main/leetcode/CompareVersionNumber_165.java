package main.leetcode;

/**
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 */
public class CompareVersionNumber_165 {
    public int compareVersion(String version1, String version2) {
        String[] v1String = version1.split("\\.");
        String[] v2String = version2.split("\\.");

        int maxLen = Math.max(v1String.length, v2String.length);
        for (int i = 0; i < maxLen; i++) {
            Integer v1 = i < v1String.length ? Integer.parseInt(v1String[i]) : 0;
            Integer v2 = i < v2String.length ? Integer.parseInt(v2String[i]) : 0;
            int vDiff = v1.compareTo(v2);
            if (vDiff != 0) {
                return vDiff;
            }
        }

        return 0;
    }
}
