package main.leetcode;

import main.common.TreeNode;

import java.util.HashMap;

/**
 * Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
 * Output: [3,9,20,null,null,15,7]
 * Hint: Store the inorder in Map and build the tree from postorder array from the end
 */
public class ConstructBTFromPostAndIn_106 {
    int index;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.index = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(postorder, 0, postorder.length - 1);
    }

    public TreeNode build(int[] postorder, int left, int right) {
        if (left > right) return null;
        int val = postorder[index--];

        TreeNode root = new TreeNode(val);
        root.right = build(postorder, map.get(val) + 1, right);
        root.left = build(postorder, left, map.get(val) - 1);

        return root;
    }
}
