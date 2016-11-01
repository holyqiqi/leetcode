package T3;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static T3.Solution.lengthOfLongestSubstring;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十月 31, 2016</pre>
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: lengthOfLongestSubstring(String s)
     */
    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        //TODO: Test goes here...
        //String s = "abcabcab";
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
