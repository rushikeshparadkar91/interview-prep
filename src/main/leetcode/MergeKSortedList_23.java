package main.leetcode;

import java.util.PriorityQueue;

public class MergeKSortedList_23 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (ListNode head : lists) {
            while (head != null) {
                q.add(head.val);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (!q.isEmpty()) {
            head.next = new ListNode(q.poll());
            head = head.next;
        }

        return dummy.next;
    }
}
