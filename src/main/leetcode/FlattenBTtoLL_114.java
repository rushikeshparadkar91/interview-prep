package main.leetcode;

import main.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Input: root = [1,2,5,3,4,null,6]
 * Output: [1,null,2,null,3,null,4,null,5,null,6]
 */
public class FlattenBTtoLL_114 {
    public void flatten(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        preorder(root, q);
        TreeNode curr = q.poll();
        while (!q.isEmpty()) {
            curr.right = q.poll();
            curr.left = null;
            curr = curr.right;
        }
    }
    public void preorder(TreeNode root, Queue<TreeNode> q) {
        if (root == null) return;
        q.offer(root);
        preorder(root.left, q);
        preorder(root.right, q);
    }
}