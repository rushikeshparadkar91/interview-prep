package main.leetcode;

import main.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BTLevelOrderTraversal_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        level(root, result, 0);
        return result;
    }

    public void level(TreeNode root, List<List<Integer>> result, int index) {
        if (root == null) return;
        if (result.size() == index) result.add(new ArrayList<Integer>());
        result.get(index).add(root.val);
        level(root.left, result, index + 1);
        level(root.right, result, index + 1);
    }
}
