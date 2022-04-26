package main.leetcode;

import main.common.ListNode;

/**
 * Input: head = [1,2,3,4,5], left = 2, right = 4
 * Output: [1,4,3,2,5]
 */
public class ReverseLinkedListII_92 {
    public ListNode reverseBetween(ListNode head, int start, int end) {
        if (head == null || start == end) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int pos = 1;
        ListNode nodeBeforeSublist = dummy;
        while (pos < start) {
            nodeBeforeSublist = nodeBeforeSublist.next;
            pos++;
        }

        ListNode workingPtr = nodeBeforeSublist.next;
        while (start < end) {
            ListNode nodeToBeExtracted = workingPtr.next;
            workingPtr.next = nodeToBeExtracted.next;
            nodeToBeExtracted.next = nodeBeforeSublist.next;
            nodeBeforeSublist.next = nodeToBeExtracted;
            start++;
        }

        return dummy.next;
    }
}
