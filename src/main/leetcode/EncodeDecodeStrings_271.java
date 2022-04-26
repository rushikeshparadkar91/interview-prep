package main.leetcode;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings_271 {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size() - 1; i++) {
            sb.append(strs.get(i));
            sb.append(Character.toString((char)257));
        }
        sb.append(strs.get(strs.size()-1));
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        String[] strs = s.split(Character.toString((char)257), -1);
        List<String> result = new ArrayList<>();
        for (String str: strs) result.add(str);
        return result;
    }
}
