package main.leetcode;

import main.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: root = [1,2]
 * Output:
 * [["","1",""],
 *  ["2","",""]]
 */
public class PrintBinaryTree_655 {
    public List<List<String>> printTree(TreeNode root) {
        int height = getHeight(root);
        List<List<String>> result = new ArrayList<List<String>>();

        int cols = (int) Math.pow(2, height) - 1;

        List<String> rowList = new ArrayList<String>();
        for (int i = 0; i < cols; i++) {
            rowList.add("");
        }

        for (int i = 0; i < height; i++) {
            result.add(new ArrayList<String>(rowList));
        }

        print(result, root, 0, 0, cols);
        return result;
    }

    public void print(List<List<String>> result, TreeNode root, int row, int start, int end) {
        if (start > end || root == null) return;
        int mid = (start + end) / 2;
        result.get(row).set(mid, String.valueOf(root.val));

        print(result, root.left, row+1,  start, mid);
        print(result, root.right, row+1, mid+1, end);
    }

    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}
