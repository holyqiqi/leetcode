/**
 * 将数组中的数放入HashTable，键为索引，值为值
 */

package T1;

import java.util.Hashtable;
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
