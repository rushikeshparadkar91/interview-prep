package main.leetcode;

import main.common.ListNode;

public class RemoveDupsFromSortedListII_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }

            if (prev.next == curr) {
                prev = curr;
            } else {
                prev.next = curr.next;
            }

            curr = curr.next;
        }


        return dummy.next;
    }

}
