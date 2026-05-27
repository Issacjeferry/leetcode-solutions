// Last updated: 5/27/2026, 12:35:31 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                seen.remove(nums[i - k - 1]);
            }

            if (seen.contains(nums[i])) {
                return true;
            }

            seen.add(nums[i]);
        }

        return false;        
    }
}