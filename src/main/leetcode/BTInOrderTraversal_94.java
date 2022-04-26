package main.leetcode;

import main.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BTInOrderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inOrder(root, result);
        return result;
    }

    public void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }
}
