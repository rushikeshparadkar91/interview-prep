package main.leetcode;

import main.common.ListNode;

/**
 * Input: head = [1,4,3,2,5,2], x = 3
 * Output: [1,2,2,4,3,5]
 */
public class PartitionList_86 {
    public ListNode partition(ListNode head, int x) {

        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        before.next = afterHead.next;
        after.next = null;

        return beforeHead.next;
    }
}
