package main.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombofPhoneNumber_17 {
    Map<Character, String> map = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    List<String> res = new ArrayList<String>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return res;

        comb(digits, 0, "");
        return res;
    }

    public void comb(String digits, int index, String current) {
        if (current.length() == digits.length()) {
            res.add(current);
            return;
        }

        String letters = map.get(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            comb(digits, index + 1, current + letter);
        }
    }
}
