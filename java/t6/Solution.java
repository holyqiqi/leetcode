package t6;

/**
 * Created by zhumengqi on 17-8-9.
 * ZigZag算法 输入abc,2 输出acb
 * a   g  m
 * b  fh ln
 * c e ik oq
 * d   j  p
 */
public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (len == 1) return s;
        StringBuilder temp = new StringBuilder(s); // 保存转换后的结果
        StringBuilder result = new StringBuilder();
        int loopNum = 2 * (numRows - 1) ;
        if (loopNum == 0)
            loopNum = 1;
        for (int curLine = 0; curLine < numRows; curLine++) {
            while (temp.length() > 0) {
                if (temp.length() > curLine)
                    result.append(temp.charAt(curLine));
                else
                    break;
                if (temp.length() > loopNum - curLine && !(curLine == 0 || curLine == loopNum / 2)) {
                    result.append(temp.charAt(loopNum- curLine));
                }
                temp.delete(0, loopNum);
            }
            temp = new StringBuilder(s);
        }
        return result.toString();
    }
}
