package t3;
/*
  Created by mike on 16-10-31.
  输入pwwkew,返回wke 最长连续子串,但不能包含重复字符.
  思路:
 */

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int max = 1;
        Map<Character, Integer> subStrPos = new Hashtable<>(); //作用: 存储当前子串及位置.
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (!subStrPos.containsKey(curChar)) {
                subStrPos.put(curChar, i);
            }else {
                int minPos = subStrPos.get(curChar);
                int curMax = subStrPos.size();
                max = max > curMax ? max : curMax;
                subStrPos = delMinMap(subStrPos, minPos);
            }
        }
        return 1;
    }
    private static Map<Character, Integer> delMinMap(Map<Character, Integer> subMap, int min){
        Set<Character> set = subMap.keySet();
        for (Character key : set) {
            int value = subMap.get(key);
            if (value <= min){
                subMap.remove(key);
            }
        }
        return subMap;
    }
}
