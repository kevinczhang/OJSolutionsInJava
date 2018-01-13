package P21_P40.P36_Valid_Sudoku;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by czhang on 1/2/2017.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            Set<Character> rows = new HashSet<>();
            Set<Character> columns = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            for (int j = 0; j < 9;j++){
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
                int rowindex = 3*(i/3);
                int colindex = 3*(i%3);
                if(board[rowindex + j/3][colindex + j%3]!='.' && !cube.add(board[rowindex + j/3][colindex + j%3]))
                    return false;
            }
        }
        return true;
    }
}
