package main.leetcode;

import java.util.*;

public class InsertDeleteGetRandomConstantTime_380 {

    class RandomizedSet {
        Map<Integer, Integer> map;
        List<Integer> list;
        Random r;

        public RandomizedSet() {
            map = new HashMap<Integer, Integer>();
            list = new ArrayList<Integer>();
            r = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val))
                return false;

            int listIndex = map.get(val);
            int lastListVal = list.get(list.size() - 1);
            if (listIndex == list.size() - 1) {
                list.remove(list.size() - 1);
                map.remove(val);
                return true;
            } else {
                map.remove(val);
                map.put(lastListVal, listIndex);
                list.set(listIndex, lastListVal);
                list.remove(list.size() - 1);
                return true;
            }
        }

        public int getRandom() {
            int randIndex = r.nextInt(list.size());
            return list.get(randIndex);
        }
    }
}