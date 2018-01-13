package P201_P300.P219_Contains_Duplicate_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by czhang on 12/26/2016.
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length <= 1)
            return false;

        Map<Integer, List<Integer>> numMap = new HashMap<Integer, List<Integer>>();
        for(int i=0; i<nums.length; i++){
            if(!numMap.containsKey(nums[i])){
                List<Integer> newIndexes = new ArrayList<Integer>();
                newIndexes.add(i);
                numMap.put(nums[i], newIndexes);
            }

            List<Integer> indexes = numMap.get(nums[i]);
            for(int j=0; j<indexes.size(); j++){
                if(i - indexes.get(j) <= k)
                    return true;
            }
            indexes.add(i);
            numMap.put(nums[i], indexes);
        }
        return  false;
    }
}
