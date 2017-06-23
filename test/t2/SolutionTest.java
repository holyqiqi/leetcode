package t2;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static t2.Solution.addTwoNumbers;

/** 
* Solution Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 23, 2017</pre> 
* @version 1.0 
*/ 
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addTwoNumbers(ListNode l1, ListNode l2)
     */
    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

//        ListNode l1 = new ListNode(1);
//        ListNode l2 = new ListNode(9);
//        l2.next = new ListNode(9);

//        ListNode l2 = new ListNode(5);
        ListNode ln = addTwoNumbers(l1, l2);
        System.out.println(ln.val + ", " + ln.next.val + ", " + ln.next.next.val);
    }
} 
