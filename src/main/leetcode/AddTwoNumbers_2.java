package main.leetcode;

public class AddTwoNumbers_2 {

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int value = carry;
        if (l1 != null) {
            value += l1.val;
        }

        if (l2 != null) {
            value += l2.val;
        }

        ListNode node = new ListNode(value % 10);
        if (l1 != null || l2 != null) {
            node.next = addTwoNumbers(l1 != null ? l1.next : null,
                    l2 != null ? l2.next : null,
                    value >= 10 ? 1 : 0
            );
        }

        return node;
    }
}
