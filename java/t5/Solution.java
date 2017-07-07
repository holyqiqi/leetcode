package t5;

/**
 * Created by zhumengqi on 17-7-2.
 * 第5题: 最大回文长度
 */
public class Solution {
    public String longestPalindrome(String s) {
        int strLen = s.length();
        int maxLen = 0, maxStart = 0, maxEnd = 1;
        for (int i = 0; i < strLen ; i++) {
            for (int j = 0; j < i; j++) {
                String curStr = s.substring(j, i+1);
                int curLength = i - j + 1;
                if (isAA(curStr, curLength ) ){
                    int curLen = i -j + 1;
                    if (maxLen < curLen){
                        maxStart = j;
                        maxEnd = i + 1;
                        maxLen = curLen;
                    }
                }
            }
        }
        return s.substring(maxStart, maxEnd);
    }
    // abba curLen=4, i=0,1  2,3
    // abcba curLen=4, i=0,1,2
    private boolean isAA(String s, int curLen){
        if (curLen == 1)
            return true;
        for (int i = 0; i < curLen / 2; i++) {
            if (s.charAt(i) != s.charAt(curLen - i - 1))
                return false;
        }
        return true;
    }
}
