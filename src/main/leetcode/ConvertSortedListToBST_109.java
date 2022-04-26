package main.leetcode;

import main.common.ListNode;
import main.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: head = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
 */
public class ConvertSortedListToBST_109 {
    /**
     *
     * SOLUTION 1
     */
    List<Integer> list = new ArrayList<Integer>();

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        return convert(0, list.size()-1);
    }

    public TreeNode convert(int left, int right) {
        if (left > right) return null;

        int mid = (left + right) / 2;
        TreeNode n = new TreeNode(list.get(mid));
        if (left == right) return n;

        n.left = convert(left, mid - 1);
        n.right = convert(mid + 1, right);
        return n;
    }


    /**
     *
     * SOLUTION 2
     */
    public TreeNode sortedListToBST2(ListNode head) {
        if (head == null) return null;
        return bst(head, null);
    }

    public TreeNode bst(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == tail) return null;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode n = new TreeNode(slow.val);
        n.left = bst(head, slow);
        n.right = bst(slow.next, tail);
        return n;
    }

}
