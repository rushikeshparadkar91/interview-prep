package main.leetcode;

import java.util.Stack;

/**
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * <p>
 * Output
 * [null,null,null,null,-3,null,0,-2]
 * <p>
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 */
public class MinStack_155 {

    Stack<Integer> minStack;
    Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack_155() {
        minStack = new Stack<Integer>();
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);

        if (!minStack.isEmpty() && x > minStack.peek())
            return;

        minStack.push(x);
    }

    public void pop() {
        int topElement = stack.pop();
        if (topElement == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }

        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }

        return minStack.peek();
    }
}
