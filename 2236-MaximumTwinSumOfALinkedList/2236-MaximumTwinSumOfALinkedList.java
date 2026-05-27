// Last updated: 5/27/2026, 12:31:17 PM
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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next=null;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int max = 0; 
        while(prev!=null && head!=null){
            int sum = prev.val+head.val;
            if(sum>max) 
                max = sum;
            prev = prev.next;
            head = head.next;
        }
        return max;       
    }
}