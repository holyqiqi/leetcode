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
        int[] result = new int[2];
        for (int num : nums) {
            hashNums.put(num, i++);
            int sub = target - nums[i];
            if (hashNums.get(sub) != null && hashNums.get(sub) != i) {
                result[1] = i;
                result[0] = hashNums.get(sub);
            } else {break;}
        }
/*        for (i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (hashNums.get(sub) != null) {
                result[1] = i;
                result[0] = hashNums.get(sub);
            } else {
            }
            hashNums.get(i);
        }*/
        return result;
    }
}
