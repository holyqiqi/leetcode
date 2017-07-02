package t4;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>七月 2, 2017</pre>
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findMedianSortedArrays(int[] nums1, int[] nums2)
     */
    @Test
    public void testFindMedianSortedArrays() throws Exception {
        Solution s = new Solution();
        // int[] nums1 = {1, 2};
        // int[] nums2 = {3, 4};
        // int[] nums1 = {1, 3};
        // int[] nums2 = {2};
        int[] nums1 = {2,3,5};
        int[] nums2 = {};
        System.out.println("mid: " + s.findMedianSortedArrays(nums1, nums2));
    }


} 
