// Last updated: 5/27/2026, 12:33:43 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        int c=0;
        int pre[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        for(int i=0;i<pre.length;i++){
            int target = pre[i]-k;
            if(hs.containsKey(target)){
                c=c+hs.get(target);
            }
            hs.put(pre[i],hs.getOrDefault(pre[i],0)+1);

        }

        return c;

        
    }
}