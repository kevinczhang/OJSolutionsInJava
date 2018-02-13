package P1_P20.P20_Valid_Parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void validParethesesTest() {
        Solution test = new Solution();
        String s = "{}";
        assertTrue(test.isValid(s));
    }

    @Test
    public void invalidParethesesTest() {
        Solution test = new Solution();
        String s = "{)";
        assertFalse(test.isValid(s));
    }
}