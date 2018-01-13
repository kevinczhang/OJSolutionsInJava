package P1_P20.P11_Container_With_Most_Water;

/**
 * Created by czhang on 12/28/2016.
 */
public class Solution {
    public int maxArea(int[] height) {
        int front = 0;
        int tail = height.length - 1;
        int result = 0;

        while (front < tail) {
            result = Math.max(result, Math.min(height[front], height[tail]) * (tail - front));
            if (height[front] < height[tail]) {
                front++;
            } else {
                tail--;
            }
        }
        return result;
    }
}
