package P1_P20.P20_Valid_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by czhang on 12/29/2016.
 */
public class Solution {
    public boolean isValid(String s) {
        // Stack to store parentheses indices
        Deque<Integer> indexStack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            // Find current char index
            int curIndex = "(){}[]".indexOf(s.charAt(i));
            // If index is even push to stack
            if (curIndex % 2 == 0) {
                indexStack.push(curIndex);
                continue;
            }
            // Stack is empty or last parethese can't pair with cur one
            if (indexStack.isEmpty() || indexStack.pop() != curIndex - 1) {
                return false;
            }
        }
        // Stack should be empty if it is valid
        return indexStack.isEmpty();
    }
}
