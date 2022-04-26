package main.leetcode;

import java.util.HashMap;

public class RomanToInt_13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] input = s.toCharArray();
        int res = 0;
        for (int i = 0; i < input.length - 1; i++) {
            if (map.get(input[i]) < map.get(input[i + 1])) {
                res = res - map.get(input[i]);
            } else {
                res = res + map.get(input[i]);
            }
        }

        return res += map.get(input[s.length() - 1]);
    }
}
