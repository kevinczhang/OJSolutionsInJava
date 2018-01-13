package P1_P100.P14_Longest_Common_Prefix;

/**
 * Created by czhang on 12/28/2016.
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            int strsInd = 0;
            while (strsInd < strs.length && i < strs[strsInd].length() &&
                    strs[strsInd].charAt(i) == strs[0].charAt(i))
                strsInd++;
            if (strsInd == strs.length) {
                res.append(strs[0].charAt(i));
            } else
                return res.toString();
        }
        return strs[0];
    }
}
