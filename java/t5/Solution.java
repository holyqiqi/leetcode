package t5;

/**
 * Created by zhumengqi on 17-7-2.
 * 第5题: 最大回文长度
 * 思路： 游标从0～longth-1, 从中心向两边遍历(区分odd, even)，变量接收最大回文串。
 */
public class Solution {
    // StringBuilder便于拼接。返回结果时再转String
    StringBuilder longest = new StringBuilder("");

    public String longestPalindrome(String s) {
        if (s.length() < 3) return s;

        // 依次遍历s，所到之处，为中心，向两边对称位置游走。
        for (int i = 0; i < s.length(); i++) {
            expand(s, longest, i, i);
            expand(s, longest, i, i + 1);
        }
        return longest.toString();
    }
    private void expand(String s, StringBuilder longest, int i, int j) {
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                if (j - i + 1 > longest.length()) {
                    longest.delete(0, longest.length());
                    longest.append(s.substring(i, j + 1));
                }
                i--;
                j++;
            }
            else
                break;
        }
    }
}
