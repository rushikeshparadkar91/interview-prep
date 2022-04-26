package main.leetcode;

import main.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 * Output: [3,9,20,null,null,15,7]
 * Hint: Store the inorder in Map and build the tree from preorder array from the start
 */
public class ConstructBTFromPreAndIn_105 {
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return dfs(preorder, 0, preorder.length - 1, map);
    }

    public TreeNode dfs(int[] preorder, int left, int right, Map<Integer, Integer> map) {
        if (left > right) return null;

        int val = preorder[index++];
        TreeNode root = new TreeNode(val);
        root.left = dfs(preorder, left, map.get(val) - 1, map);
        root.right = dfs(preorder, map.get(val) + 1, right, map);
        return root;
    }
}
