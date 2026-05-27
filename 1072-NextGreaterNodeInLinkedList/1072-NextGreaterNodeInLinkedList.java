// Last updated: 5/27/2026, 12:32:34 PM
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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode curr=head;
        Stack<Integer> st = new Stack<>();
        while(curr!=null){
            al.add(curr.val);
            curr=curr.next;
        }
        int arr[] = new int[al.size()];
        for(int i=al.size()-1;i>=0;i--){
            int x = al.get(i);
            while(!st.empty() && x >= st.peek()){
                st.pop();
            }
            if(st.empty()){
                arr[i]=0;
            }else{
                arr[i]=st.peek();

            }
            st.push(x);
        }
        return arr;
        
    }
}