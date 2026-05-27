// Last updated: 5/27/2026, 12:30:15 PM
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        long sum = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    row[i] += grid[i][j];
                    col[j] += grid[i][j];
                    sum+=grid[i][j];
            }
        }
        if(sum%2 !=0){
            return false;
        }
        long rows = 0;
        for(int i=0;i<m;i++){
            rows += row[i];
            if(rows == sum-rows)
                return true;
        }
        long cols = 0;
        for(int j=0;j<n;j++){
            cols+=col[j];
            if(cols==sum-cols)
                return true;
        }
        return false;
    }
}