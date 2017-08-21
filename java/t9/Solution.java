package t9;

/**
 * Created by zhumengqi on 17-8-19.
 * 思考：1.取最高位（反复计算，开销大）
 * 2.栈，把放完后对栈进行分析
 * 3.用一个新变量，从后往前拼接完，比较返回boolean.
 *  123321 121
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int temp = x; // 保存原始数字，用作最后跟反转的数对比
        int rev = 0;
        while (x > 0) {
            int yushu = x % 10;
            rev = rev * 10 + yushu;
            x /= 10;
        }
        return temp == rev;
    }
}
