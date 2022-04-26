package main.leetcode;

import main.common.TreeNode;

import java.util.*;

/**
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[15,7],[9,20],[3]]
 */
public class BTLevelOrderTraversal2_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (q.peek() != null && q.peek().left != null) q.add(q.peek().left);
                if (q.peek() != null && q.peek().right != null) q.add(q.peek().right);
                temp.add(q.poll().val);
            }
            result.add(0, temp);
        }

        return result;
    }
}
