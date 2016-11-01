package T3;

import java.util.Hashtable;

/**
 * Created by mike on 16-10-31.
 * 输入pwwkew,返回wke
 */
public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Hashtable<Character, Integer> subTable = new Hashtable<>();
        for (int i=0;i<s.length();i++) {
            int curMax = 0;
            int lastChar = subTable.get(s.charAt(i));
        }
        return max+1;
    }
}
