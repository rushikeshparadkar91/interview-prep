package main.leetcode;

import main.common.ListNode;

/**
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [4,5,1,2,3]
 */
public class RotateList_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;

        ListNode curr = head;
        int n = 1;
        while (curr.next != null) {
            n++;
            curr = curr.next;
        }

        curr.next = head;

        for (int i = n - k % n; i > 1; i--) {
            head = head.next;
        }

        ListNode q = head.next;
        head.next = null;
        return q;
    }
}
