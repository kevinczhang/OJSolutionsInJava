package P1_P100.P27_Remove_Element;

/**
 * Created by czhang on 12/30/2016.
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }

        if (nums.length == 1) {
            return nums[0] == val ? 0 : 1;
        }

        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        while (firstIndex < lastIndex) {
            if (nums[firstIndex] != val) {
                firstIndex++;
                continue;
            }
            nums[firstIndex] += nums[lastIndex];
            nums[lastIndex] = nums[firstIndex] - nums[lastIndex];
            nums[firstIndex] = nums[firstIndex] - nums[lastIndex];
            lastIndex--;
        }

        return nums[firstIndex] == val ? firstIndex : firstIndex + 1;
    }
}
