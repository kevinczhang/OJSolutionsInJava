package P1_P20.P6_Zigzag_Conversion;

import P1_P20.P6_Zigzag_Conversion.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void convert() {
        String s = "PAYPALISHIRING";
        int nRows = 3;

        Solution test1 = new Solution();
        String result = test1.convert(s, nRows);
        assertTrue(result.equals("PAHNAPLSIIGYIR"));
    }
}