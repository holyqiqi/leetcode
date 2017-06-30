package t3;
/*
  Created by mike on 16-10-31.
  输入pwwkew,返回wke 最长连续子串,但不能包含重复字符.
  思路:
  注意: 为空
  算法性能比例: 37%
  TODO:方案2 链表法,标示位置 会不会更快
 */

import java.util.Hashtable;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0, minPos = 0, curMax = 0;
        Map<Character, Integer> subStrPos = new Hashtable<>();
        if (s.length() > 0)
            max = 1;
        //ohvhjdml
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (!subStrPos.containsKey(curChar)) {
            }else if (subStrPos.get(curChar) > minPos){
                minPos = subStrPos.get(curChar) + 1;
            }else if (subStrPos.get(curChar) == minPos) {
                minPos += 1;
            }
            curMax = i - minPos + 1;
            max = max > curMax ? max : curMax;
            subStrPos.put(curChar, i);
        }
        curMax = s.length() - 1 - minPos;
        max = max > curMax ? max : curMax;
        return max;
    }
}
/*
57ms代码:
public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int length = s.length();
        int res = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0, j = 0; i < length; i++){

            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)));
            }

            map.put(s.charAt(i), i + 1);
            res = Math.max(res, i - j +1);

        }

        return res;
    }
}
*/
