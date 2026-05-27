// Last updated: 5/27/2026, 12:33:59 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i:nums2){
            while(!st.empty() && i>st.peek()){
                hs.put(st.pop(),i);
            }
            st.push(i);
        }
        while(!st.empty()){
            hs.put(st.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = hs.get(nums1[i]);
        }
        return nums1;
    }
}