package main.leetcode;

import main.common.ListNode;

/**
 * Input: head = [4,2,1,3]
 * Output: [1,2,3,4]
 */
public class SortList_148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return mergeTwoLists(l1, l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                res.next = l1;
                l1 = l1.next;
            } else {
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }

        res.next = l1 == null ? l2 : l1;

        return dummy.next;
    }
}
