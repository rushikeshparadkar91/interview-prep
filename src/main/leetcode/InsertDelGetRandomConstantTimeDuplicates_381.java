package main.leetcode;

import java.util.*;

public class InsertDelGetRandomConstantTimeDuplicates_381 {
    class RandomizedCollection {
        List<Integer> list;
        Map<Integer, Set<Integer>> map;
        Random r;
        public RandomizedCollection() {
            list = new ArrayList<Integer>();
            map = new HashMap<Integer, Set<Integer>>();
            r = new Random();
        }

        public boolean insert(int val) {
            if (!map.containsKey(val)) {
                map.put(val, new LinkedHashSet<Integer>());
            }
            map.get(val).add(list.size());
            list.add(val);
            return map.get(val).size() == 1;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val) || map.get(val).size() == 0) return false;

            int removeIndex = map.get(val).iterator().next();
            int lastElement = list.get(list.size() - 1);
            map.get(val).remove(removeIndex);
            list.set(removeIndex, lastElement);
            map.get(lastElement).add(removeIndex);
            map.get(lastElement).remove(list.size() - 1);
            list.remove(list.size() - 1);
            return true;
        }

        public int getRandom() {
            return list.get(r.nextInt(list.size()));
        }
    }
}
