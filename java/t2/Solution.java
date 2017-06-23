package t2;

/**
 * Created by zhumengqi on 2017-6-23.
 */

//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(0);
        ln.next = l1;
        do {
            ln = ln.next;
            System.out.println("当前数字为: " + ln.val);
        }while(!ln.equals(null));
        return ln;
    }
}
