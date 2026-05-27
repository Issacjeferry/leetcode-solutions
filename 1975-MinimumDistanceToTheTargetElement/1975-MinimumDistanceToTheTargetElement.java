// Last updated: 5/27/2026, 12:31:36 PM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                min = Math.min(min, Math.abs(start - i));
            }
        }

        return min;
    }
}