// Last updated: 5/27/2026, 12:34:09 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int index=nums[i]-1;
            if(nums[i]!=nums[index]){
                int t=nums[i];
                nums[i]=nums[index];
                nums[index]=t;
            }else
                i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
        
    }
}