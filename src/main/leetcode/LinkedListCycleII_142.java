package main.leetcode;

import main.common.ListNode;

/**
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 */
public class LinkedListCycleII_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Detect if there is a loop or exit if traversed till the end.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Loop detected - so break.
                break;
            }
        }

        // Check if fast pointer has reached the end to indicate no loop.
        if (fast == null || fast.next == null) return null;

        // Find the meeting point of both the pointers which would indicate the start of the loop.
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Both slow and fast would be met at same point, so can return either slow or fast.
        return slow;
    }
}
