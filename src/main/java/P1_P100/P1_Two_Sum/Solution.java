package P1_P100.P1_Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
