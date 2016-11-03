package T1;

import java.util.Hashtable;

/**
 * 将数组中的数放入HashTable，键为索引，值为值
 * TODO 1.执行时间超时。2.数组中可以有重复的数
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashNums = new Hashtable<>();
        int i = 0;
        int[] result = {0,0};
        for (int num : nums) {
            int sub = target - nums[i];
            if (hashNums.get(sub) != null && hashNums.get(sub) != i) {
                result[1] = i;
                result[0] = hashNums.get(sub);
                return result;
            } else {
                hashNums.put(num, i++);
                continue;
            }
        }
        return result;
    }
}
