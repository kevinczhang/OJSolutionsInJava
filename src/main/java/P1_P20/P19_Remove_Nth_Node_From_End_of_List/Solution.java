package P1_P20.P19_Remove_Nth_Node_From_End_of_List;

import common.ListNode;

/**
 * Created by czhang on 12/29/2016.
 */
public class Solution {
    /**
     * The key to find the node before the nth node from end
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer n nodes
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap n
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        // Remove the node
        second.next = second.next.next;
        // Return the head
        return dummy.next;
    }
}
