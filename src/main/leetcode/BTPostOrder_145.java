package main.leetcode;

import main.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
 */
public class BTPostOrder_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<Integer>();

        List<Integer> list = new ArrayList<Integer>();
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);

        return list;
    }
}
