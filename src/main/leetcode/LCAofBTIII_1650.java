package main.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3
 * Explanation: The LCA of nodes 5 and 1 is 3.
 */
public class LCAofBTIII_1650 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;
    }
    /**
     * Solution 1
     **/
    public Node lowestCommonAncestor2(Node p, Node q) {
        Node curr = p;
        Set<Node> set = new HashSet<Node>();
        while (curr != null) {
            set.add(curr);
            curr = curr.parent;
        }

        curr = q;
        while (curr != null) {
            if (set.contains(curr)) {
                return curr;
            } else {
                curr = curr.parent;
            }
        }

        return null;
    }

    /**
     * Solution 2
     **/
    public Node lowestCommonAncestor(Node p, Node q) {
        Node a = p, b = q;
        while(a != b) {
            a = a != null ? a.parent : q;
            b = b != null ? b.parent : p;
        }
        return a;
    }
}
