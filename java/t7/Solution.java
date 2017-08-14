package t7;

/**
 * Created by zhumengqi on 17-8-14.
 * x = -123, return -321。32位有符号整型
 * 1.递归，拼接出同符号的数字； 2.符号位翻转  3.边界值
 * 注意： 溢出不能用负来判断。
 */
public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int lastNum = x % 10;
            int reverNum = result * 10 + lastNum;
            if ((reverNum - lastNum) / 10 != result ) // 这里阅读别人的代码 通过新result接收新值，比较是否溢出。
                return 0;
            result = reverNum;
            x /= 10;
        }
        return result;
    }
}
