// Last updated: 5/27/2026, 12:32:15 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int res=0;
        ListNode curr=head;
        while(curr!=null){  // it is like using the exactract the digits and adding refere the vs code for full code
            res=res*2+curr.val;
            curr=curr.next;
        }
    return res;
    }
}