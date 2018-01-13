package P1_P100.P8_String_to_Integer;

/**
 * Created by czhang on 12/26/2016.
 */
public class Solution {
    public int atoi(String str) {
        String curStr = str.trim();
        int ind = 0;
        boolean isPositive = true;
        long longRes = 0;

        if(curStr.length() > 0 && (curStr.charAt(0) == '+' || curStr.charAt(0) == '-')) {
            isPositive = curStr.charAt(0) == '+';
            ind++;
        }

        while(ind < curStr.length() && Character.isDigit(curStr.charAt(ind))){
            longRes = longRes*10 + curStr.charAt(ind) - '0';
            if(isPositive && longRes >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(!isPositive && -1*longRes <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            ind++;
        }

        return isPositive ? (int)longRes : -1*(int)longRes;
    }
}
