// Last updated: 5/27/2026, 12:33:53 PM
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,-1);
        int prefix_sum=0;
        for(int i=0;i<nums.length;i++){
            prefix_sum +=nums[i];
            int remainder = prefix_sum%k;
            if(hs.containsKey(remainder)){
                if(i - hs.get(remainder) >= 2) {
                    return true;
                } 
            }else{
                hs.put(remainder,i);
            }
        }
        
        return false;
        
        
    }
}