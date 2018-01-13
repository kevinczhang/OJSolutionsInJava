package P1_P20.P14_Longest_Common_Prefix;

import P1_P20.P14_Longest_Common_Prefix.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestCommonPrefix() {
        Solution test = new Solution();
        String res = test.longestCommonPrefix(new String[]{});
        assertTrue("".equals(res));
    }
}