// Last updated: 5/27/2026, 12:34:25 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> a = new HashSet<>();
        Set <Integer> b = new HashSet<>(); 
        for(int i:nums1){
            a.add(i);
        }        
        for(int j:nums2){
            if(a.contains(j)){
                b.add(j);
            }
        }
        int ans[] =new int[b.size()];
        int i=0;
        for(int val:b){
            ans[i++]=val;
        }

        return ans;
    }
}