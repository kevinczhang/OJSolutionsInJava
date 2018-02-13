package P1_P20.P10_Regular_Expression_Matching;

public class Solution {
    // http://codinginterviewzone.blogspot.com/2016/06/regular-expression-matching.html
    public boolean isMatch(String s, String p) {
        //if(p != null && p.length() > 0 && p.charAt(0) == '*') return false;
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 0; i <= m; i++){
            for (int j = 1; j <= n; j++){
                if (p.charAt(j - 1) == '*'){
                    // pattern repeats for 0 times
                    dp[i][j] = dp[i][j - 2];
                    // the pattern repeats for at least 1 times
                    dp[i][j] |= i > 0 && dp[i - 1][j] &&
                            (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.');
                } else
                    dp[i][j] = i > 0 && dp[i - 1][j - 1] &&
                            (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.');
            }
        }
        return dp[m][n];
    }
}
