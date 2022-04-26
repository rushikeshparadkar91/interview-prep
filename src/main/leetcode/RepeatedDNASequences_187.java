package main.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
 * Output: ["AAAAACCCCC","CCCCCAAAAA"]
 *
 *
 */
public class RepeatedDNASequences_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < s.length() - 9; i++) {
            String sub = s.substring(i, i + 10);
            if (!map.containsKey(sub)) {
                map.put(sub, 1);
            } else {
                map.put(sub, map.get(sub) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
