package P201_P300.P217_Contains_Duplicate;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void containsDuplicate() {
        Solution test = new Solution();
        int[] nums = new int[]{1, 2, 1};
        boolean res = test.containsDuplicate(nums);
        assertEquals(res, true);
    }
}