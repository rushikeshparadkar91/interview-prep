package main.leetcode;

import main.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: root = [3,9,20,null,null,15,7]
 * Output: [[3],[20,9],[15,7]]
 */
public class BTZigZagOrderTraversal_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        zigzag(root, result, 0);
        return result;
    }

    public void zigzag(TreeNode root, List<List<Integer>> result, int index) {
        if (root == null) return;
        if (result.size() == index) result.add(new ArrayList<Integer>());
        List<Integer> collection = result.get(index);
        if (index % 2 == 1) {
            collection.add(0, root.val);
        } else {
            collection.add(root.val);
        }

        zigzag(root.left, result, index + 1);
        zigzag(root.right, result, index + 1);
    }
}
