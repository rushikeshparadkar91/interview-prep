package main.leetcode;

import main.common.TreeNode;

/**
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 */
public class ConvertSAToBST_108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int s, int e) {
        if (s > e) return null;

        int mid = (s + e) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, s, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, e);
        return node;
    }
}
