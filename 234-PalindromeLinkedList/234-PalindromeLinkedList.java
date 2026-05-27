// Last updated: 5/27/2026, 12:35:21 PM
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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;

    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){   
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode right=reverse(slow);
        while(right!=null){
            if(head.val != right.val){
                return false;
            }
            head=head.next;
            right=right.next;
        }
        return true;

        
    }
}