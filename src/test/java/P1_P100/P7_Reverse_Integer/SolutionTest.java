package P1_P100.P7_Reverse_Integer;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverse() {
        Solution test = new Solution();
        int res = test.reverse(100);
        assertTrue(res == 1);
    }
}