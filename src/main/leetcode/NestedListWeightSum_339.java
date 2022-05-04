package main.leetcode;

import java.util.LinkedList;
import java.util.List;

public class NestedListWeightSum_339 {
      // This is the interface that allows for creating nested lists.
      // You should not implement it, or speculate about its implementation
      public interface NestedInteger {
          // @return true if this NestedInteger holds a single integer, rather than a nested list.
          public boolean isInteger();

          // @return the single integer that this NestedInteger holds, if it holds a single integer
          // Return null if this NestedInteger holds a nested list
          public Integer getInteger();

          // Set this NestedInteger to hold a single integer.
          public void setInteger(int value);

          // Set this NestedInteger to hold a nested list and adds a nested integer to it.
          public void add(NestedInteger ni);

          // @return the nested list that this NestedInteger holds, if it holds a nested list
          // Return empty list if this NestedInteger holds a single integer
          public List<NestedInteger> getList();
      }


    // Solution 1
    public int depthSum2(List<NestedInteger> nestedList) {
        return depthSum(nestedList, 1);
    }

    public int depthSum(List<NestedInteger> nestedList, int depth) {
        int total = 0;
        for (NestedInteger nestedInteger: nestedList) {
            if (nestedInteger.isInteger()) {
                total += nestedInteger.getInteger() * depth;
            } else {
                total += depthSum(nestedInteger.getList(), depth + 1);
            }
        }

        return total;
    }

    // Solution 2
    public int depthSum(List<NestedInteger> nestedList) {
        int total = 0;

        LinkedList<NestedInteger> queue = new LinkedList<NestedInteger>();
        queue.addAll(nestedList);
        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                NestedInteger current = queue.poll();
                if (current.isInteger()) {
                    total += current.getInteger() * depth;
                } else {
                    queue.addAll(current.getList());
                }
            }
            depth++;
        }

        return total;
    }
}
