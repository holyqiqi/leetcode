package t8;

/**
 * Created by zhumengqi on 17-8-14.
 * atoi 输入string，输出int test: -A01234.56
 * 思路：
 * 1.判断正负，
 * 2.判断是不是数字，是则乘以10加。不是数字，结束。
 */
public class Solution {
    public int myAtoi(String str) {
        int result = 0;
        int sign = 1;
        StringBuilder sb = new StringBuilder(str.trim());
        if (sb.length() == 0)
            return 0;
        if (sb.charAt(0) == '-') {
            sb.delete(0, 1);
            sign = -1;
        }
        else if (sb.charAt(0) == '+') {
            sb.delete(0, 1);
            sign = 1;
        }
        while (sb.length() > 0) {
            char curChar = sb.charAt(0);
            if (!Character.isDigit(curChar))
                return sign * result;
            else {
                int temp = result;
                result = 10 * result + curChar - '0';
                if (result / 10 != temp) {
                    if (sign == -1)
                        return Integer.MIN_VALUE;
                    else
                        return Integer.MAX_VALUE;
                }else {

                }
            }
            sb.delete(0, 1);
        }
        return sign * result;
    }
}
