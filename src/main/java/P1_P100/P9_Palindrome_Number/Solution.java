package P1_P100.P9_Palindrome_Number;

/**
 * Created by czhang on 12/26/2016.
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x < 10){
            return true;
        }
        int getFirst = 10;
        int num = x;
        while(num/getFirst >= 10)
            getFirst *= 10;
        while(getFirst >= 10){
            if((num/getFirst)%10 != num % 10){
                return false;
            }
            getFirst /= 100;
            num /=10;
        }
        return true;
    }
}
