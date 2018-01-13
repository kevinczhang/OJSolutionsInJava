package P1_P20.P9_Palindrome_Number;

import P1_P20.P9_Palindrome_Number.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        Solution test = new Solution();
        boolean res = test.isPalindrome(101);
        assertTrue(res);
    }
}