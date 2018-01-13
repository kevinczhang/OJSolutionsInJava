package P1_P100.P1_Two_Sum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    @Test
    public void twoSum() {
        Solution test = new Solution();
        int[] nums = {1, 2, 3};
        int[] res = test.twoSum(nums, 3);
        assertArrayEquals(res, new int[] {0, 1});
    }
}
