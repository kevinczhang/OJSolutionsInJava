package P1_P20.P13_Roman_to_Integer;

import P1_P20.P13_Roman_to_Integer.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {
        Solution test = new Solution();
        int res = test.romanToInt("I");
        assertTrue(res == 1);
    }
}