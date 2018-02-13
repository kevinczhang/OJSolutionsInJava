package P1_P20.P20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by czhang on 12/29/2016.
 */
public class Solution {
    public boolean isValid(String s) {
        Deque<Integer> p = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            int q = "(){}[]".indexOf(s.charAt(i));
            if(q % 2 == 0){
                p.push(q);
                continue;
            }
            if(p.isEmpty() || p.pop() != q - 1){
                return false;
            }
        }
        return p.isEmpty();
    }
}
