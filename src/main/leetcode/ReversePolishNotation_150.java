package main.leetcode;

import java.util.Stack;

/**
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 */
public class ReversePolishNotation_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int a, b;
        for (String token : tokens) {
            if (token.equals("+")) {
                b = stack.pop();
                a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                b = stack.pop();
                a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("/")) {
                b = stack.pop();
                a = stack.pop();
                stack.push(a / b);
            } else if (token.equals("*")) {
                b = stack.pop();
                a = stack.pop();
                stack.push(a * b);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
