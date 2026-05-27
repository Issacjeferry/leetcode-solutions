// Last updated: 5/27/2026, 12:34:11 PM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int idx=nums[i]-1;
            if(nums[i]!=nums[idx]){
                int t=nums[i];
                nums[i]=nums[idx];
                nums[idx]=t;
            }
            else
                i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
        
    }
}