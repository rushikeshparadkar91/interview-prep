package main.leetcode;

import main.common.TreeNode;

/**
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 */
public class BalancedBT_110 {
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return isBalanced(root.left) && isBalanced(root.right) &&
                Math.abs(height(root.left) - height(root.right)) <= 1;
    }
}
