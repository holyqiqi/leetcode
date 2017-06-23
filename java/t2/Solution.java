package t2;

/**
 * Created by zhumengqi on 2017-6-23.
 * 第二题
 * 阻塞点: 1.创建两个链表时写错了l2为L1,导致NullPointerExcep.
 * 2.生成结果时,如何连接每个result节点: 头节点不动,声明一个指针节点顺序移动,修改next值
 */

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode before = sum;
        int flag = 0;
        do {
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            ListNode nodeSum = new ListNode(0);
            nodeSum.val = l1.val + l2.val + flag;
            flag=0;
            if (nodeSum.val >= 10) {
                nodeSum.val = nodeSum.val - 10;
                flag = 1;
            }
            before.next = nodeSum;
            before = nodeSum;
            l1 = l1.next;
            l2 = l2.next;

        } while (l1 != null || l2 != null);
        if (flag == 1) {
            before.next = new ListNode(flag);
        }
        sum = sum.next;
        return sum;
    }
}
