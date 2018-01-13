package P1_P100.P13_Roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by czhang on 12/28/2016.
 */
public class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        int len = s.length();
        int index = 0;
        int res = 0;
        while(index < len){
            if((index+1 < len) && map.containsKey(s.substring(index, index+2))){
                res += map.get(s.substring(index, index+2));
                index += 2;
            }
            else{
                res += map.get(s.substring(index, index+1));
                index++;
            }
        }
        return res;
    }
}
