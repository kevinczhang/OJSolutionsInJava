package P1_P20.P8_String_to_Integer;

import P1_P20.P8_String_to_Integer.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void atoi() {
        Solution test = new Solution();
        int res = test.atoi("+1");
        assertTrue(res == 1);
    }
}