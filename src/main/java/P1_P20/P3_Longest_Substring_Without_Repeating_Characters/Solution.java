package P1_P20.P3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int startIndex = -1, endIndex = 0, maxLen = 0;
        for (; endIndex < s.length(); endIndex++){
            char curChar = s.charAt(endIndex);
            if (map.containsKey(curChar) && startIndex < map.get(curChar)){
                startIndex = map.get(curChar);
            }
            maxLen = Math.max(maxLen, endIndex - startIndex);
            map.put(curChar, endIndex);
        }
        return maxLen;
    }
}
