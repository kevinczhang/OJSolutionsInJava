package P1_P20.P11_Container_With_Most_Water;

import P1_P20.P11_Container_With_Most_Water.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void maxArea() {
        Solution test = new Solution();
        int[] height = new int[] {1, 1};
        int area = test.maxArea(height);
        Assert.assertEquals(area, 1);
    }
}