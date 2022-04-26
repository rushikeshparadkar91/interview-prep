package main.leetcode;

import main.common.ListNode;

/**
 * Input: head = [1,2,6,3,4,5,6], val = 6
 * Output: [1,2,3,4,5]
 *
 * Input: head = [7,7,7,7], val = 7
 * Output: []
 */
public class RemoveLLElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
