package P1_P100.P26_Remove_Duplicates_from_Sorted_Array;

/**
 * Created by czhang on 12/30/2016.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;

        int endIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[endIndex]){
                endIndex++;
                nums[endIndex] = nums[i];
            }
        }
        return endIndex + 1;
    }
}
