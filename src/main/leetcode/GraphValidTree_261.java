package main.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Input: n = 5, edges = [[0,1],[0,2],[0,3],[1,4]]
 * Output: true
 */
public class GraphValidTree_261 {
    List<List<Integer>> adj = new ArrayList<List<Integer>>();
    Set<Integer> seen = new HashSet<>();

    public boolean validTree(int n, int[][] edges) {
        // For the graph to be a tree it needs to have exactly n-1 edges.
        if (edges.length != n - 1) return false;


        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int[] edge: edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        dfs(0);
        return seen.size() == n;
    }

    public void dfs(int node) {
        if (seen.contains(node)) return;
        seen.add(node);
        for (int neighbor: adj.get(node)) {
            dfs(neighbor);
        }
    }
}
