package T1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十月 20, 2016</pre>
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: twoSum(int[] nums, int target)
     */

    @Test
    public void testTwoSum() throws Exception {
        Solution sol = new Solution();
        int[] nums = {0, 4, 3, 0};
        //int[] nums = {1, 2, 4};
        int target = 3;
        int[] res = sol.twoSum(nums, target);
        System.out.println("num1: " + res[0] + "  num2: " + res[1]);
    }
}
