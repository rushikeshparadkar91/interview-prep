package main.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses_22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generate("", 0, 0, n, result);
        return result;
    }

    public void generate(String comb, int open, int close, int n, List<String> result) {
        if (comb.length() == n * 2) {
            result.add(comb);
            return;
        }

        if (open < n) {
            generate(comb + "(", open + 1, close, n, result);
        }
        if (close < open) {
            generate(comb + ")", open, close + 1, n, result);
        }
    }
}
