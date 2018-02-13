package P1_P20.P15_3Sum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
            while (lo < hi) {
                if (nums[lo] + nums[hi] < sum) {
                    lo++;
                    continue;
                } else if (nums[lo] + nums[hi] > sum) {
                    hi--;
                    continue;
                }

                res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                while (lo < hi && nums[lo] == nums[lo + 1]) {
                    lo++;
                }
                while (lo < hi && nums[hi] == nums[hi - 1]) {
                    hi--;
                }
                lo++;
                hi--;
            }
        }
        return res;
    }
}
