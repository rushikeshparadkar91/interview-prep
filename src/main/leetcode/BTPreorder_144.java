package main.leetcode;

import main.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
 */
public class BTPreorder_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return new ArrayList<Integer>();

        List<Integer> list = new ArrayList<Integer>();
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));

        return list;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null)
            return new ArrayList<Integer>();

        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode next = stack.pop();
            list.add(next.val);
            if (next.right != null) stack.push(next.right);
            if (next.left != null) stack.push(next.left);

        }

        return list;
    }
}
