package P1_P20.P2_Add_Two_Numbers;

import common.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0); // set pre head
        ListNode d = pre;
        int sum = 0; // the sum of two nodes
        while (l1 != null || l2 != null) { // traverse longer list
            if (l1 != null) { // add one list
                sum += l1.val;
                l1 = l1.next; // move on
            }
            if (l2 != null) { // add another list
                sum += l2.val;
                l2 = l2.next; // move on
            }
            // build next node
            d.next = new ListNode(sum % 10); // digit for current node
            sum /= 10; // carry
            d = d.next;
        }
        if (sum == 1) d.next = new ListNode(1); // note that can have carry at the last digit
        return pre.next;
    }
}
