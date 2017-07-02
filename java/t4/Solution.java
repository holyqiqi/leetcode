package t4;


/**
 * Created by zhumengqi on 17-7-2.
 * 第四题:两个有序数组中位数
 * 遍历两个数组
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 声明链表和数组
        List<Integer> mergeArrayList = new ArrayList<>();
        List<Integer> mergeLinkedList = new LinkedList<>();
        // 遍历1,求出
        int num1Length = nums1.length;
        int num2Length = nums2.length;
        for (int i = 0, j = 0; i < num1Length || j < num2Length; ) {
            if (i == num1Length){
                mergeArrayList.add(nums2[j]);
                mergeLinkedList.add(nums2[j++]);
            }
            else if (j == num2Length){
                mergeArrayList.add(nums1[i]);
                mergeLinkedList.add(nums1[i++]);
            }
            else if (nums1[i] <= nums2[j]) {
                mergeArrayList.add(nums1[i]);
                mergeLinkedList.add(nums1[i++]);
            }else {
                mergeArrayList.add(nums2[j]);
                mergeLinkedList.add(nums2[j++]);
            }
        }
        int sub = num1Length - num2Length;
        if (sub > 0) {
            for (int i = sub; i < num1Length;) {
                mergeArrayList.add(nums1[i]);
                mergeLinkedList.add(nums1[i++]);
            }
        }else if (sub < 0){
            for (int i = -sub; i < num1Length;) {
                mergeArrayList.add(nums2[i]);
                mergeLinkedList.add(nums2[i++]);
            }
        }
        int sum = num1Length + num2Length;
        float mid;
        if (sum % 2 == 0){
            mid = (float)(mergeArrayList.get((sum + 1) / 2) + mergeArrayList.get((sum - 1) / 2)) / 2;
        }else {
            mid = mergeArrayList.get(sum / 2);
        }
        return mid;
    }
}
