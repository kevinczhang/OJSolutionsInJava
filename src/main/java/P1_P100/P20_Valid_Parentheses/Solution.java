package P1_P100.P20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by czhang on 12/29/2016.
 */
public class Solution {
    public boolean isValid(String s) {
        Deque<Integer> p = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            int q = "(){}[]".indexOf(s.substring(i, i + 1));
            if(q % 2 == 1) {
                if(p.isEmpty() || p.pop() != q - 1){
                    return false;
                }
            } else p.push(q);
        }
        return p.isEmpty();
    }
}
