package P1_P100.P11_Container_With_Most_Water;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void maxArea() {
        Solution test = new Solution();
        int[] height = new int[] {1, 1};
        int area = test.maxArea(height);
        Assert.assertEquals(area, 1);
    }
}