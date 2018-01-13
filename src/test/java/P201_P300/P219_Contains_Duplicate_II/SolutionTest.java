package P201_P300.P219_Contains_Duplicate_II;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void containsNearbyDuplicate() {
        Solution test = new Solution();
        int[] nums = new int[]{1, 2, 1};
        boolean res = test.containsNearbyDuplicate(nums, 1);
        assertEquals(res, true);
    }
}