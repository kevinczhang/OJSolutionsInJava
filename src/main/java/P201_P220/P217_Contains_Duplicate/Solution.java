package P201_P220.P217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by czhang on 12/26/2016.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) return false;

        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) {
            if (numSet.contains(num)) return true;
            numSet.add(num);
        }
        return false;
    }
}
