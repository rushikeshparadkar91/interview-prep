package main.leetcode;

import main.common.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class SecondMinInBST_671 {
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> result = new HashSet<Integer>();
        inorder(root, result);
        int min1 = root.val;
        long ans = Long.MAX_VALUE;
        for (Integer val : result) {
            if (val > min1 && val < ans) {
                ans = val;
            }
        }
        return ans != Long.MAX_VALUE ? (int) ans : -1;
    }

    public void inorder(TreeNode root, Set<Integer> result) {
        if (root == null) return;
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
}
