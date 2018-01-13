package P1_P20.P6_Zigzag_Conversion;

/**
 * Created by czhang on 12/26/2016.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        int nRow = 0;
        int flag = 0;
        StringBuilder[] resultRows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            resultRows[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            resultRows[nRow].append(s.charAt(i));
            if (nRow == 0) {
                flag = 1;
            }else if(nRow == numRows-1){
                flag = -1;
            }
            nRow += flag;
        }

        for (int i = 1; i < resultRows.length; i++) {
            resultRows[0].append(resultRows[i]);
        }
        return resultRows[0].toString();
    }
}
