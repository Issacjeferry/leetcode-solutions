// Last updated: 5/27/2026, 12:31:52 PM
class Solution {
    public int maxProductPath(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        
        long[][] prev = new long[n][2];
        
        prev[0][0] = grid[0][0];
        prev[0][1] = grid[0][0];
        
        for (int j = 1; j < n; j++) {
            long val = grid[0][j];
            prev[j][0] = prev[j - 1][0] * val;
            prev[j][1] = prev[j - 1][1] * val;
        }
        
        for (int i = 1; i < m; i++) {
            long[][] curr = new long[n][2];
        
            long val = grid[i][0];
            curr[0][0] = prev[0][0] * val;
            curr[0][1] = prev[0][1] * val;
            
            for (int j = 1; j < n; j++) {
                val = grid[i][j];
                
                long topMax = prev[j][0];
                long topMin = prev[j][1];
                long leftMax = curr[j - 1][0];
                long leftMin = curr[j - 1][1];
                
                long a = topMax * val;
                long b = topMin * val;
                long c = leftMax * val;
                long d = leftMin * val;
                
                long currMax = Math.max(Math.max(a, b), Math.max(c, d));
                long currMin = Math.min(Math.min(a, b), Math.min(c, d));
                
                curr[j][0] = currMax;
                curr[j][1] = currMin;
            }
                
            prev = curr;
        }
        
        long result = prev[n - 1][0];
        
        if (result < 0) return -1;
        
        return (int)(result % 1_000_000_007);
    }
}