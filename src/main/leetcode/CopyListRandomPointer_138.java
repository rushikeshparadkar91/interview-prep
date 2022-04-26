package main.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
 * Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
 */
public class CopyListRandomPointer_138 {
    Map<Node, Node> map = new HashMap<Node, Node>();

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        if (map.containsKey(head)) {
            return map.get(head);
        }
        Node node = new Node(head.val);
        map.put(head, node);

        node.next = copyRandomList(head.next);
        node.random = copyRandomList(head.random);

        return node;

    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
