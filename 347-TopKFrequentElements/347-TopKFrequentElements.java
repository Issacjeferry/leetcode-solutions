// Last updated: 5/27/2026, 12:34:27 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans[] = new int[k];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> l = new ArrayList<>(map.keySet());
        Collections.sort(l, (a, b) -> map.get(b) - map.get(a));
        for(int i=0;i<k;i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}