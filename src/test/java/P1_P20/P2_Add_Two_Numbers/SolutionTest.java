package P1_P20.P2_Add_Two_Numbers;

import P1_P20.P2_Add_Two_Numbers.Solution;
import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void test1() {
        int[] array1 = {9,8};
        ListNode l1 = new ListNode(array1[0]);
        ListNode l1_cur = l1;
        for(int i=1; i<array1.length; i++){
            l1_cur.next = new ListNode(array1[i]);
            l1_cur = l1_cur.next;
        }

        int[] array2 = {1};
        ListNode l2 = new ListNode(array2[0]);
        ListNode l2_cur = l2;
        for(int i=1; i<array2.length; i++){
            l2_cur.next = new ListNode(array2[i]);
            l2_cur = l2_cur.next;
        }

        Solution test = new Solution();
        ListNode res = test.addTwoNumbers(l1, l2);
        assertTrue(res.val == 0);
    }
}