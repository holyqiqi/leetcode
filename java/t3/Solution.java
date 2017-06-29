package t3;
/*
  Created by mike on 16-10-31.
  输入pwwkew,返回wke 最长连续子串,但不能包含重复字符.
  思路:
 */

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> subTable = new Hashtable<>();
        int finalMax = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean existsFlag = subTable.get(s.charAt(i)) != null;
            if (existsFlag) {
                finalMax = finalMax > subTable.size() ? finalMax : subTable.size();
                int oldPos = subTable.get(s.charAt(i));
                Set<Character> keySet = subTable.keySet();
                List<Character> willRemove = new ArrayList<>();
                for (char key : keySet) {
                    int curPos = subTable.get(key);
                    if (curPos < oldPos) {
                        willRemove.add(key);
                    }
                }
                for (char key : willRemove) {
                    subTable.remove(key);
                }
                willRemove.clear();
                subTable.put(s.charAt(i), i);
            } else {
                subTable.put(s.charAt(i), i);
            }
            finalMax = finalMax > subTable.size() ? finalMax : subTable.size();
        }
        return finalMax;
    }
}
