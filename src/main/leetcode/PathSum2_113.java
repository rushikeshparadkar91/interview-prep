package main.leetcode;

import main.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * Output: [[5,4,11,2],[5,8,4,5]]
 * Explanation: There are two paths whose sum equals targetSum:
 * 5 + 4 + 11 + 2 = 22
 * 5 + 8 + 4 + 5 = 22
 */
public class PathSum2_113 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        pathSum(root, targetSum, result, new ArrayList<>());
        return result;
    }

    public void pathSum(TreeNode root, int targetSum, List<List<Integer>> result, List<Integer> temp) {
        if (root == null) return;
        temp.add(root.val);

        if (root.left == null && root.right == null && root.val == targetSum) {
            result.add(new ArrayList<Integer>(temp));
        } else {
            pathSum(root.left, targetSum - root.val, result, temp);
            pathSum(root.right, targetSum - root.val, result, temp);
        }
        temp.remove(temp.size() - 1);
    }
}
