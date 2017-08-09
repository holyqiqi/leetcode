package t5;

/**
 * Created by zhumengqi on 17-7-2.
 * 第5题: 最大回文长度
 * 思路： 游标从0～longth-1, 从中心向两边遍历(区分odd, even)，变量接收最大回文串。
 */
public class Solution {
    StringBuilder longest = new StringBuilder("");

    public String longestPalindrome(String s) {
        if (s.length() <= 2 ) return s;

        // TODO: odd, even
        for (int i = 0; i < s.length(); i++) {
            expand(s, longest, i, i); // odd
            expand(s, longest, i, i + 1); // odd
        }

        return longest.toString();
    }
    private void expand(String s, StringBuilder longest, int i, int j){
        // 以i 或i,j为中心，遍历左右，求最大回文串！
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
