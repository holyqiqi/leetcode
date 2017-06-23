package t1;

import java.util.Hashtable;
/**
 * 将数组中的数放入HashTable，键为索引，值为值
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashNums = new Hashtable<>();
        int i = 0;
        for (int num : nums) {
            int sub = target - nums[i];
            if (hashNums.get(sub) != null && hashNums.get(sub) != i) {
                return new int[]{hashNums.get(sub), i};
            } else {
                hashNums.put(num, i++);
            }
        }
        return new int[]{0, 0,};
    }
}
