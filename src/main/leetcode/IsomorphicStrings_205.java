package main.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 */
public class IsomorphicStrings_205 {
    public boolean isIsomorphic2(String s, String t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (!map.containsKey(schar)) {
                if (!map.containsValue(tchar)) {
                    map.put(schar, tchar);
                } else {
                    return false;
                }
            } else {
                if (map.get(schar) != tchar) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)])
                return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }

        return true;
    }
}
