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
* 
* Method: addTwoNumbers(ListNode l1, ListNode l2) 
* 
*/ 
@Test
public void testAddTwoNumbers() throws Exception {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);
    l1.next.next.next = l1;
//    ListNode l1t2 = new ListNode(4);
//    ListNode l1t3 = new ListNode(3);
//    l1t3.next=null;
//    l1t2.next = l1t3;
//    l1.next = l1t2;
    ListNode l2 = new ListNode(2);
    ListNode l2t1 = new ListNode(4);
    ListNode l2t2 = new ListNode(3);
    l1.next = l2t1;
    l2t1.next = l2t2;
    l2t2.next=null;

    ListNode ln = addTwoNumbers(l1,l2);
    System.out.println();
} 


} 
