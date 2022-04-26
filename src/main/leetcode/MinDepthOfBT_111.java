package main.leetcode;

import main.common.TreeNode;

/**
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 */
public class MinDepthOfBT_111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        int min = Integer.MAX_VALUE;
        if (root.left != null) min = Math.min(min, minDepth(root.left));
        if (root.right != null) min = Math.min(min, minDepth(root.right));

        return min + 1;
    }
}
