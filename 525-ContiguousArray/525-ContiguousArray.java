// Last updated: 5/27/2026, 12:33:51 PM
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,-1);
        int sum=0,maxl=0,l;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum-=1;
            }else
                sum+=1;
            if(hs.containsKey(sum)){
                l=i-hs.get(sum);
                maxl=Math.max(maxl,l);
            }else{
                hs.put(sum,i);
            }
        }
        return maxl;
    }
}