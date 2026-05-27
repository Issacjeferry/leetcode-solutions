// Last updated: 5/27/2026, 12:34:48 PM
class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n + 2];
        arr[0] = 1;
        arr[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }

        int[][] dp = new int[n + 2][n + 2];

        for (int length = 2; length < n + 2; length++) {
            for (int left = 0; left < n + 2 - length; left++) {
                int right = left + length;

                for (int k = left + 1; k < right; k++) {
                    int coins = arr[left] * arr[k] * arr[right];
                    int total = dp[left][k] + dp[k][right] + coins;

                    dp[left][right] = Math.max(dp[left][right], total);
                }
            }
        }

        return dp[0][n + 1];
    }
}